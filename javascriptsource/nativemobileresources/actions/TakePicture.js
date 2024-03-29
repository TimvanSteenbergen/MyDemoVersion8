// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";
import { Alert, Linking, NativeModules, Platform } from "react-native";
import { launchCamera, launchImageLibrary } from "react-native-image-picker";
import { getLocales } from "react-native-localize";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {MxObject} picture - This field is required.
 * @param {"NativeMobileResources.PictureSource.camera"|"NativeMobileResources.PictureSource.imageLibrary"} pictureSource - Select a picture from the library or the camera. The default is camera.
 * @param {"NativeMobileResources.PictureQuality.original"|"NativeMobileResources.PictureQuality.low"|"NativeMobileResources.PictureQuality.medium"|"NativeMobileResources.PictureQuality.high"|"NativeMobileResources.PictureQuality.custom"} pictureQuality - Set to empty to use default value 'medium'.
 * @param {Big} maximumWidth - The picture will be scaled to this maximum pixel width, while maintaing the aspect ratio.
 * @param {Big} maximumHeight - The picture will be scaled to this maximum pixel height, while maintaing the aspect ratio.
 * @returns {Promise.<boolean>}
 */
export async function TakePicture(picture, pictureSource, pictureQuality, maximumWidth, maximumHeight) {
	// BEGIN USER CODE
    if (!picture) {
        return Promise.reject(new Error("Input parameter 'Picture' is required"));
    }
    if (!picture.inheritsFrom("System.FileDocument")) {
        return Promise.reject(new Error(`Entity ${picture.getEntity()} does not inherit from 'System.FileDocument'`));
    }
    if (pictureQuality === "custom" && !maximumHeight && !maximumWidth) {
        return Promise.reject(new Error("Picture quality is set to 'Custom', but no maximum width or height was provided"));
    }
    // V3 dropped the feature of providing an action sheet so users can decide on which action to take, camera or library.
    const nativeVersionMajor = NativeModules.ImagePickerManager.showImagePicker ? 2 : 4;
    const RNPermissions = nativeVersionMajor === 4 ? require("react-native-permissions") : null;
    try {
        const uri = await takePicture();
        if (!uri) {
            return false;
        }
        return storeFile(picture, uri);
    }
    catch (error) {
        if (error === "canceled") {
            return false;
        }
        throw new Error(error);
    }
    function takePicture() {
        return new Promise((resolve, reject) => {
            const options = nativeVersionMajor === 2 ? getOptionsV2() : getOptionsV4();
            getPictureMethod()
                .then(method => method(options, (response) => {
                if (response.didCancel) {
                    return resolve(undefined);
                }
                if (nativeVersionMajor === 2) {
                    response = response;
                    if (response.error) {
                        const unhandledError = handleImagePickerV2Error(response.error);
                        if (!unhandledError) {
                            return resolve(undefined);
                        }
                        return reject(new Error(response.error));
                    }
                    return resolve(response.uri);
                }
                response = response;
                if (response.errorCode) {
                    handleImagePickerV4Error(response.errorCode, response.errorMessage);
                    return resolve(undefined);
                }
                return resolve(response.assets[0].uri);
            }))
                .catch(error => reject(error));
        });
    }
    function storeFile(imageObject, uri) {
        return new Promise((resolve, reject) => {
            fetch(uri)
                .then(response => response.blob())
                .then(blob => {
                // eslint-disable-next-line no-useless-escape
                const filename = /[^\/]*$/.exec(uri)[0];
                const filePathWithoutFileScheme = uri.replace("file://", "");
                mx.data.saveDocument(imageObject.getGuid(), filename, {}, blob, async () => {
                    await NativeModules.NativeFsModule.remove(filePathWithoutFileScheme);
                    imageObject.set("Name", filename);
                    mx.data.commit({
                        mxobj: imageObject,
                        callback: () => resolve(true),
                        error: (error) => reject(error)
                    });
                }, async (error) => {
                    await NativeModules.NativeFsModule.remove(filePathWithoutFileScheme);
                    reject(error);
                });
            })
                .catch(error => reject(error));
        });
    }
    async function getPictureMethod() {
        async function handleCameraRequest() {
            if (Platform.OS === "android" && nativeVersionMajor === 4) {
                await checkAndMaybeRequestAndroidPermission();
            }
            return launchCamera;
        }
        switch (pictureSource) {
            case "imageLibrary":
                return launchImageLibrary;
            case "camera":
                return handleCameraRequest();
            default:
                return handleCameraRequest();
        }
    }
    async function checkAndMaybeRequestAndroidPermission() {
        let requestResult;
        async function requestAndroidPermission() {
            requestResult = await RNPermissions.request(RNPermissions.PERMISSIONS.ANDROID.CAMERA);
            if (requestResult === RNPermissions.RESULTS.DENIED) {
                // re-enter request flow. note, if a request is denied twice, result = blocked.
                requestResult = await requestAndroidPermission();
            }
            return requestResult;
        }
        // https://github.com/zoontek/react-native-permissions#android-flow
        const statusResult = await RNPermissions.check(RNPermissions.PERMISSIONS.ANDROID.CAMERA);
        switch (statusResult) {
            case RNPermissions.RESULTS.UNAVAILABLE:
                throw new Error("The camera is unavailable.");
            case RNPermissions.RESULTS.BLOCKED:
                throw new Error("Camera access for this app is currently blocked.");
            case RNPermissions.RESULTS.DENIED:
                requestResult = await requestAndroidPermission();
                if (requestResult === RNPermissions.RESULTS.BLOCKED) {
                    throw new Error("Camera access for this app is currently blocked.");
                }
                break;
        }
    }
    function getOptionsV2() {
        const { maxWidth, maxHeight } = getPictureQuality();
        const [language] = getLocales().map(local => local.languageCode);
        const isDutch = language === "nl";
        return {
            mediaType: "photo",
            maxWidth,
            maxHeight,
            noData: true,
            title: isDutch ? "Foto toevoegen" : "Select a photo",
            cancelButtonTitle: isDutch ? "Annuleren" : "Cancel",
            takePhotoButtonTitle: isDutch ? "Foto maken" : "Take photo",
            chooseFromLibraryButtonTitle: isDutch ? "Kies uit bibliotheek" : "Choose from library",
            permissionDenied: {
                title: isDutch
                    ? "Deze app heeft geen toegang tot uw camera of foto bibliotheek"
                    : "This app does not have access to your camera or photo library",
                text: isDutch
                    ? "Ga naar Instellingen > Privacy om toegang tot uw camera en bestanden te verlenen."
                    : "To enable access, tap Settings > Privacy and turn on Camera and Photos/Storage.",
                reTryTitle: isDutch ? "Instellingen" : "Settings",
                okTitle: isDutch ? "Annuleren" : "Cancel"
            },
            storageOptions: {
                skipBackup: true,
                cameraRoll: false,
                privateDirectory: true
            }
        };
    }
    function getOptionsV4() {
        const { maxWidth, maxHeight } = getPictureQuality();
        return {
            mediaType: "photo",
            maxWidth,
            maxHeight
        };
    }
    function getPictureQuality() {
        switch (pictureQuality) {
            case "low":
                return {
                    maxWidth: 1024,
                    maxHeight: 1024
                };
            case "medium":
            default:
                return {
                    maxWidth: 2048,
                    maxHeight: 2048
                };
            case "high":
                return {
                    maxWidth: 4096,
                    maxHeight: 4096
                };
            case "custom":
                return {
                    maxWidth: Number(maximumWidth),
                    maxHeight: Number(maximumHeight)
                };
        }
    }
    function handleImagePickerV2Error(error) {
        const ERRORS = {
            AndroidPermissionDenied: "Permissions weren't granted",
            iOSPhotoLibraryPermissionDenied: "Photo library permissions not granted",
            iOSCameraPermissionDenied: "Camera permissions not granted"
        };
        switch (error) {
            case ERRORS.iOSPhotoLibraryPermissionDenied:
                showAlert("This app does not have access to your photo library", "To enable access, tap Settings and turn on Photos.");
                return;
            case ERRORS.iOSCameraPermissionDenied:
                showAlert("This app does not have access to your camera", "To enable access, tap Settings and turn on Camera.");
                return;
            case ERRORS.AndroidPermissionDenied:
                // Ignore this error because the image picker plugin already shows an alert in this case.
                return;
            default:
                return error;
        }
    }
    function showAlert(title, message) {
        Alert.alert(title, message, [
            { text: "Cancel", style: "cancel" },
            ...(Platform.OS === "ios"
                ? [{ text: "Settings", onPress: () => Linking.openURL("app-settings:") }]
                : [])
        ], { cancelable: false });
    }
    function handleImagePickerV4Error(errorCode, errorMessage) {
        var _a;
        switch (errorCode) {
            case "camera_unavailable":
                showAlert("The camera is unavailable", "");
                break;
            case "permission":
                showAlert("This app does not have access to your photo library or camera", "To enable access, tap Settings and turn on Camera and Photos.");
                break;
            case "others":
                showAlert("Something went wrong.", (_a = `${errorMessage}.`) !== null && _a !== void 0 ? _a : "Something went wrong while trying to access your Camera or photo library.");
                break;
            default:
                showAlert("Something went wrong.", "Something went wrong while trying to access your Camera or photo library.");
                break;
        }
    }
	// END USER CODE
}

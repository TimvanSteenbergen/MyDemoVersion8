// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {string} text - This text will get spoken out loud
 * @returns {Promise.<boolean>}
 */
export async function TextToSpeech(text) {
	// BEGIN USER CODE
	if (!text) {
		return Promise.resolve(false);
	}
    if ("speechSynthesis" in window === false) {
        return Promise.reject("Browser does not support text to speech");

    }
    // var utterance = new SpeechSynthesisUtterance(text);
    // window.speechSynthesis.speak(utterance);
    // return Promise.resolve(true);
    return new Promise(function(resolve, reject) {
        var utterance = new SpeechSynthesisUtterance(text);
        utterance.onend = function() {
            resolve(true);
        };
        utterance.onerror = function(event) {
            reject("An error occured during playback: " + event.error);
        };
        window.speechSynthesis.speak(utterance);
    });	
	// END USER CODE
}

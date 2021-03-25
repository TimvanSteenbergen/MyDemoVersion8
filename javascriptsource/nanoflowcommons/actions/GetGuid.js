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
 * @param {MxObject} entityObject - This field is required.
 * @returns {Promise.<string>}
 */
export async function GetGuid(entityObject) {
	// BEGIN USER CODE
  if (!entityObject) {
    throw new TypeError("Input parameter 'Entity object' is required.");
  }
  return entityObject.getGuid();
	// END USER CODE
}
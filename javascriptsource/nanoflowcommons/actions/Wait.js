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
 * @param {Big} delay - The number of milliseconds to wait. This field is required.
 * @returns {Promise.<boolean>}
 */
export async function Wait(delay) {
	// BEGIN USER CODE
  if (delay == null) {
    throw new TypeError("Input parameter 'delay' is required.");
  }
  return new Promise(function (resolve) {
    setTimeout(function () {return resolve(true);}, Number(delay));
  });
	// END USER CODE
}

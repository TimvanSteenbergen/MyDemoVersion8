// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package barcode.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the Barcode module
	/**
	 * Microflow which generates/updates the barcode image, Barcode object gets committed at the end of the java action.
	 */
	public static boolean sUB_Barcode_GenerateBarcode(IContext context, barcode.proxies.Barcode _barcode)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Barcode", _barcode == null ? null : _barcode.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Barcode.SUB_Barcode_GenerateBarcode").withParams(params).execute(context);
	}
}
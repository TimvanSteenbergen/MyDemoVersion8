// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package goodies.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class GenerateHMAC_SHA1 extends CustomJavaAction<java.lang.String>
{
	private java.lang.String key;
	private java.lang.String valueToEncrypt;

	public GenerateHMAC_SHA1(IContext context, java.lang.String key, java.lang.String valueToEncrypt)
	{
		super(context);
		this.key = key;
		this.valueToEncrypt = valueToEncrypt;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA1");
		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(secretKey);
		mac.update(valueToEncrypt.getBytes("UTF-8"));

		Formatter formatter = new Formatter();

		for (byte b : mac.doFinal()) {
			formatter.format("%02x", b);
		}
		return formatter.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GenerateHMAC_SHA1";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

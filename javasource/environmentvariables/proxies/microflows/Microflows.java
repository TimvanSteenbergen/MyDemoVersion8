// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package environmentvariables.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the EnvironmentVariables module
	public static boolean aSu_EnvironmentVariables(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("EnvironmentVariables.ASu_EnvironmentVariables").withParams(params).execute(context);
	}
	public static java.lang.String sUB_EnvironmentLetterGet(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("EnvironmentVariables.SUB_EnvironmentLetterGet").withParams(params).execute(context);
	}
}
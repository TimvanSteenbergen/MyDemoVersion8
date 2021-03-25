// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mydemoversion8.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyDemoVersion8 module
	public static boolean aSu_MyDemoVersion8(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyDemoVersion8.ASu_MyDemoVersion8").withParams(params).execute(context);
	}
	public static domdal.proxies.Country dS_ProjectCountry_ByAssociation(IContext context, domdal.proxies.Project _project)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Project", _project == null ? null : _project.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MyDemoVersion8.DS_ProjectCountry_ByAssociation").withParams(params).execute(context);
		return result == null ? null : domdal.proxies.Country.initialize(context, result);
	}
	public static domdal.proxies.Country dS_ProjectCountry_ByXPath(IContext context, domdal.proxies.Project _project)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Project", _project == null ? null : _project.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MyDemoVersion8.DS_ProjectCountry_ByXPath").withParams(params).execute(context);
		return result == null ? null : domdal.proxies.Country.initialize(context, result);
	}
}
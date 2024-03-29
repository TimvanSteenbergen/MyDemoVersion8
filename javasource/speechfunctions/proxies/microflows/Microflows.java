// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package speechfunctions.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the SpeechFunctions module
	public static speechfunctions.proxies.SoundRecord dS_SoundRecorder_GetOrCreate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("SpeechFunctions.DS_SoundRecorder_GetOrCreate").withParams(params).execute(context);
		return result == null ? null : speechfunctions.proxies.SoundRecord.initialize(context, result);
	}
	public static speechfunctions.proxies.Speech dS_Speech_GetOrCreate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("SpeechFunctions.DS_Speech_GetOrCreate").withParams(params).execute(context);
		return result == null ? null : speechfunctions.proxies.Speech.initialize(context, result);
	}
}
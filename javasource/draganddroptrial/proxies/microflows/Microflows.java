// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package draganddroptrial.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DragAndDropTrial module
	public static void act_Card_ChangeLane(IContext context, draganddroptrial.proxies.CardDnD _draggedCard)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DraggedCard", _draggedCard == null ? null : _draggedCard.getMendixObject());
		Core.microflowCall("DragAndDropTrial.Act_Card_ChangeLane").withParams(params).execute(context);
	}
	public static draganddroptrial.proxies.Thing dS_Thing_GetOrCreate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("DragAndDropTrial.DS_Thing_GetOrCreate").withParams(params).execute(context);
		return result == null ? null : draganddroptrial.proxies.Thing.initialize(context, result);
	}
	public static boolean sUB_FileDoc_Commit(IContext context, draganddroptrial.proxies.FileDoc _fileDoc)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("FileDoc", _fileDoc == null ? null : _fileDoc.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("DragAndDropTrial.SUB_FileDoc_Commit").withParams(params).execute(context);
	}
	public static boolean sUB_Image_Commit(IContext context, draganddroptrial.proxies.Image _image)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Image", _image == null ? null : _image.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("DragAndDropTrial.SUB_Image_Commit").withParams(params).execute(context);
	}
}
// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package parallelexecute.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import parallelexecute.actions.ParallelMap.ParallelMicroflowExecutor;

/**
 * Executes a microflow for every object in a list.
 * The return value of the called microflow is ignored.
 * 
 * Returns: Nothing
 * 
 */
public class ParallelForEach extends CustomJavaAction<IMendixObject>
{
	private java.util.List<IMendixObject> List_;
	private java.lang.String Microflow_;

	public ParallelForEach(IContext context, java.util.List<IMendixObject> List_, java.lang.String Microflow_)
	{
		super(context);
		this.List_ = List_;
		this.Microflow_ = Microflow_;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		final ParallelMicroflowExecutor<Void> executor =
				new ParallelMicroflowExecutor<>(getContext(), Microflow_, null, null);
		executor.execute(() -> {
			List_.parallelStream()
			.forEach((obj) -> {
				executor.executeMicroflowInClonedContext(obj);
			});
			return null;
		});
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ParallelForEach";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
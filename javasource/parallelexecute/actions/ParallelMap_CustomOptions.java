// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package parallelexecute.actions;

import java.util.List;
import java.util.stream.Collectors;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import parallelexecute.actions.ParallelMap.ParallelMicroflowExecutor;

/**
 * Returns a list of object that are the result of executing the microflow with a corresponding object from the input list.
 * The called microflow should return object of type OutputType or a specialization of it.
 */
public class ParallelMap_CustomOptions extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> List_;
	private java.lang.String Microflow_;
	private java.lang.String OutputType_;
	private IMendixObject __Options_;
	private parallelexecute.proxies.ParallelExecuteOptions Options_;

	public ParallelMap_CustomOptions(IContext context, java.util.List<IMendixObject> List_, java.lang.String Microflow_, java.lang.String OutputType_, IMendixObject Options_)
	{
		super(context);
		this.List_ = List_;
		this.Microflow_ = Microflow_;
		this.OutputType_ = OutputType_;
		this.__Options_ = Options_;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.Options_ = __Options_ == null ? null : parallelexecute.proxies.ParallelExecuteOptions.initialize(getContext(), __Options_);

		// BEGIN USER CODE
		ParallelMap.validateParameterAndMicroflow(List_, Microflow_, OutputType_, false);
		final ParallelMicroflowExecutor<List<IMendixObject>> executor =
				new ParallelMicroflowExecutor<>(getContext(), Microflow_, null, Options_);
		return executor.execute(() -> {
			return List_.parallelStream()
			.map((obj) -> {
				return (IMendixObject) executor.executeMicroflowInClonedContext(obj);
			})
			.collect(Collectors.toList());
		});
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ParallelMap_CustomOptions";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
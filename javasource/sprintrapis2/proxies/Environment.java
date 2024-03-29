// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sprintrapis2.proxies;

public class Environment
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject environmentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SprintrApis2.Environment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		URL("URL"),
		Mode("Mode"),
		Status("Status"),
		Environment_App("SprintrApis2.Environment_App");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Environment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SprintrApis2.Environment"));
	}

	protected Environment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject environmentMendixObject)
	{
		if (environmentMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SprintrApis2.Environment", environmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SprintrApis2.Environment");

		this.environmentMendixObject = environmentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Environment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sprintrapis2.proxies.Environment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sprintrapis2.proxies.Environment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sprintrapis2.proxies.Environment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sprintrapis2.proxies.Environment(context, mendixObject);
	}

	public static sprintrapis2.proxies.Environment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sprintrapis2.proxies.Environment.initialize(context, mendixObject);
	}

	public static java.util.List<sprintrapis2.proxies.Environment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sprintrapis2.proxies.Environment> result = new java.util.ArrayList<sprintrapis2.proxies.Environment>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SprintrApis2.Environment" + xpathConstraint))
			result.add(sprintrapis2.proxies.Environment.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of URL
	 */
	public final java.lang.String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final java.lang.String getURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(java.lang.String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return value of Mode
	 */
	public final java.lang.String getMode()
	{
		return getMode(getContext());
	}

	/**
	 * @param context
	 * @return value of Mode
	 */
	public final java.lang.String getMode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Mode.toString());
	}

	/**
	 * Set value of Mode
	 * @param mode
	 */
	public final void setMode(java.lang.String mode)
	{
		setMode(getContext(), mode);
	}

	/**
	 * Set value of Mode
	 * @param context
	 * @param mode
	 */
	public final void setMode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mode)
	{
		getMendixObject().setValue(context, MemberNames.Mode.toString(), mode);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final sprintrapis2.proxies.Enum_EnvironmentStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final sprintrapis2.proxies.Enum_EnvironmentStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return sprintrapis2.proxies.Enum_EnvironmentStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(sprintrapis2.proxies.Enum_EnvironmentStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, sprintrapis2.proxies.Enum_EnvironmentStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Environment_App
	 */
	public final sprintrapis2.proxies.App getEnvironment_App() throws com.mendix.core.CoreException
	{
		return getEnvironment_App(getContext());
	}

	/**
	 * @param context
	 * @return value of Environment_App
	 */
	public final sprintrapis2.proxies.App getEnvironment_App(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sprintrapis2.proxies.App result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Environment_App.toString());
		if (identifier != null)
			result = sprintrapis2.proxies.App.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Environment_App
	 * @param environment_app
	 */
	public final void setEnvironment_App(sprintrapis2.proxies.App environment_app)
	{
		setEnvironment_App(getContext(), environment_app);
	}

	/**
	 * Set value of Environment_App
	 * @param context
	 * @param environment_app
	 */
	public final void setEnvironment_App(com.mendix.systemwideinterfaces.core.IContext context, sprintrapis2.proxies.App environment_app)
	{
		if (environment_app == null)
			getMendixObject().setValue(context, MemberNames.Environment_App.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Environment_App.toString(), environment_app.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return environmentMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sprintrapis2.proxies.Environment that = (sprintrapis2.proxies.Environment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SprintrApis2.Environment";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package domdal.proxies;

/**
 * Information about each app at Mendix. 
 */
public class MendixApp_Imported
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mendixApp_ImportedMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DomDAL.MendixApp_Imported";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AppId("AppId"),
		ProjectId("ProjectId"),
		Url("Url"),
		Name("Name");

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

	public MendixApp_Imported(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DomDAL.MendixApp_Imported"));
	}

	protected MendixApp_Imported(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixApp_ImportedMendixObject)
	{
		if (mendixApp_ImportedMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DomDAL.MendixApp_Imported", mendixApp_ImportedMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DomDAL.MendixApp_Imported");

		this.mendixApp_ImportedMendixObject = mendixApp_ImportedMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MendixApp_Imported.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static domdal.proxies.MendixApp_Imported initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return domdal.proxies.MendixApp_Imported.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static domdal.proxies.MendixApp_Imported initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new domdal.proxies.MendixApp_Imported(context, mendixObject);
	}

	public static domdal.proxies.MendixApp_Imported load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return domdal.proxies.MendixApp_Imported.initialize(context, mendixObject);
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
	 * @return value of AppId
	 */
	public final java.lang.String getAppId()
	{
		return getAppId(getContext());
	}

	/**
	 * @param context
	 * @return value of AppId
	 */
	public final java.lang.String getAppId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AppId.toString());
	}

	/**
	 * Set value of AppId
	 * @param appid
	 */
	public final void setAppId(java.lang.String appid)
	{
		setAppId(getContext(), appid);
	}

	/**
	 * Set value of AppId
	 * @param context
	 * @param appid
	 */
	public final void setAppId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String appid)
	{
		getMendixObject().setValue(context, MemberNames.AppId.toString(), appid);
	}

	/**
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId()
	{
		return getProjectId(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProjectId.toString());
	}

	/**
	 * Set value of ProjectId
	 * @param projectid
	 */
	public final void setProjectId(java.lang.String projectid)
	{
		setProjectId(getContext(), projectid);
	}

	/**
	 * Set value of ProjectId
	 * @param context
	 * @param projectid
	 */
	public final void setProjectId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String projectid)
	{
		getMendixObject().setValue(context, MemberNames.ProjectId.toString(), projectid);
	}

	/**
	 * @return value of Url
	 */
	public final java.lang.String getUrl()
	{
		return getUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of Url
	 */
	public final java.lang.String getUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url.toString());
	}

	/**
	 * Set value of Url
	 * @param url
	 */
	public final void setUrl(java.lang.String url)
	{
		setUrl(getContext(), url);
	}

	/**
	 * Set value of Url
	 * @param context
	 * @param url
	 */
	public final void setUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.Url.toString(), url);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mendixApp_ImportedMendixObject;
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
			final domdal.proxies.MendixApp_Imported that = (domdal.proxies.MendixApp_Imported) obj;
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
		return "DomDAL.MendixApp_Imported";
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

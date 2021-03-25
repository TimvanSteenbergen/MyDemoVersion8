// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sprintrapis2.proxies;

/**
 * Information about each app at Mendix. 
 */
public class App
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject appMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SprintrApis2.App";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AppId("AppId"),
		Name("Name"),
		Url("Url"),
		ProjectId("ProjectId"),
		Update("Update"),
		Hide("Hide"),
		LinkToProject("LinkToProject"),
		LinkToStoryPage("LinkToStoryPage"),
		LinkToStory("LinkToStory"),
		LinkToFeedbackPage("LinkToFeedbackPage"),
		LinkToFeedbackitem("LinkToFeedbackitem"),
		LinkToEnvironments("LinkToEnvironments"),
		LinkToMetrics("LinkToMetrics"),
		LinkToAlerts("LinkToAlerts"),
		LinkToLog("LinkToLog");

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

	public App(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SprintrApis2.App"));
	}

	protected App(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject appMendixObject)
	{
		if (appMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SprintrApis2.App", appMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SprintrApis2.App");

		this.appMendixObject = appMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'App.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sprintrapis2.proxies.App initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sprintrapis2.proxies.App.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sprintrapis2.proxies.App initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sprintrapis2.proxies.App(context, mendixObject);
	}

	public static sprintrapis2.proxies.App load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sprintrapis2.proxies.App.initialize(context, mendixObject);
	}

	public static java.util.List<sprintrapis2.proxies.App> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sprintrapis2.proxies.App> result = new java.util.ArrayList<sprintrapis2.proxies.App>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SprintrApis2.App" + xpathConstraint))
			result.add(sprintrapis2.proxies.App.initialize(context, obj));
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
	 * @return value of Update
	 */
	public final java.lang.Boolean getUpdate()
	{
		return getUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of Update
	 */
	public final java.lang.Boolean getUpdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Update.toString());
	}

	/**
	 * Set value of Update
	 * @param update
	 */
	public final void setUpdate(java.lang.Boolean update)
	{
		setUpdate(getContext(), update);
	}

	/**
	 * Set value of Update
	 * @param context
	 * @param update
	 */
	public final void setUpdate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean update)
	{
		getMendixObject().setValue(context, MemberNames.Update.toString(), update);
	}

	/**
	 * @return value of Hide
	 */
	public final java.lang.Boolean getHide()
	{
		return getHide(getContext());
	}

	/**
	 * @param context
	 * @return value of Hide
	 */
	public final java.lang.Boolean getHide(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Hide.toString());
	}

	/**
	 * Set value of Hide
	 * @param hide
	 */
	public final void setHide(java.lang.Boolean hide)
	{
		setHide(getContext(), hide);
	}

	/**
	 * Set value of Hide
	 * @param context
	 * @param hide
	 */
	public final void setHide(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hide)
	{
		getMendixObject().setValue(context, MemberNames.Hide.toString(), hide);
	}

	/**
	 * @return value of LinkToProject
	 */
	public final java.lang.String getLinkToProject()
	{
		return getLinkToProject(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToProject
	 */
	public final java.lang.String getLinkToProject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToProject.toString());
	}

	/**
	 * Set value of LinkToProject
	 * @param linktoproject
	 */
	public final void setLinkToProject(java.lang.String linktoproject)
	{
		setLinkToProject(getContext(), linktoproject);
	}

	/**
	 * Set value of LinkToProject
	 * @param context
	 * @param linktoproject
	 */
	public final void setLinkToProject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktoproject)
	{
		getMendixObject().setValue(context, MemberNames.LinkToProject.toString(), linktoproject);
	}

	/**
	 * @return value of LinkToStoryPage
	 */
	public final java.lang.String getLinkToStoryPage()
	{
		return getLinkToStoryPage(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToStoryPage
	 */
	public final java.lang.String getLinkToStoryPage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToStoryPage.toString());
	}

	/**
	 * Set value of LinkToStoryPage
	 * @param linktostorypage
	 */
	public final void setLinkToStoryPage(java.lang.String linktostorypage)
	{
		setLinkToStoryPage(getContext(), linktostorypage);
	}

	/**
	 * Set value of LinkToStoryPage
	 * @param context
	 * @param linktostorypage
	 */
	public final void setLinkToStoryPage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktostorypage)
	{
		getMendixObject().setValue(context, MemberNames.LinkToStoryPage.toString(), linktostorypage);
	}

	/**
	 * @return value of LinkToStory
	 */
	public final java.lang.String getLinkToStory()
	{
		return getLinkToStory(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToStory
	 */
	public final java.lang.String getLinkToStory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToStory.toString());
	}

	/**
	 * Set value of LinkToStory
	 * @param linktostory
	 */
	public final void setLinkToStory(java.lang.String linktostory)
	{
		setLinkToStory(getContext(), linktostory);
	}

	/**
	 * Set value of LinkToStory
	 * @param context
	 * @param linktostory
	 */
	public final void setLinkToStory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktostory)
	{
		getMendixObject().setValue(context, MemberNames.LinkToStory.toString(), linktostory);
	}

	/**
	 * @return value of LinkToFeedbackPage
	 */
	public final java.lang.String getLinkToFeedbackPage()
	{
		return getLinkToFeedbackPage(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToFeedbackPage
	 */
	public final java.lang.String getLinkToFeedbackPage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToFeedbackPage.toString());
	}

	/**
	 * Set value of LinkToFeedbackPage
	 * @param linktofeedbackpage
	 */
	public final void setLinkToFeedbackPage(java.lang.String linktofeedbackpage)
	{
		setLinkToFeedbackPage(getContext(), linktofeedbackpage);
	}

	/**
	 * Set value of LinkToFeedbackPage
	 * @param context
	 * @param linktofeedbackpage
	 */
	public final void setLinkToFeedbackPage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktofeedbackpage)
	{
		getMendixObject().setValue(context, MemberNames.LinkToFeedbackPage.toString(), linktofeedbackpage);
	}

	/**
	 * @return value of LinkToFeedbackitem
	 */
	public final java.lang.String getLinkToFeedbackitem()
	{
		return getLinkToFeedbackitem(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToFeedbackitem
	 */
	public final java.lang.String getLinkToFeedbackitem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToFeedbackitem.toString());
	}

	/**
	 * Set value of LinkToFeedbackitem
	 * @param linktofeedbackitem
	 */
	public final void setLinkToFeedbackitem(java.lang.String linktofeedbackitem)
	{
		setLinkToFeedbackitem(getContext(), linktofeedbackitem);
	}

	/**
	 * Set value of LinkToFeedbackitem
	 * @param context
	 * @param linktofeedbackitem
	 */
	public final void setLinkToFeedbackitem(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktofeedbackitem)
	{
		getMendixObject().setValue(context, MemberNames.LinkToFeedbackitem.toString(), linktofeedbackitem);
	}

	/**
	 * @return value of LinkToEnvironments
	 */
	public final java.lang.String getLinkToEnvironments()
	{
		return getLinkToEnvironments(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToEnvironments
	 */
	public final java.lang.String getLinkToEnvironments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToEnvironments.toString());
	}

	/**
	 * Set value of LinkToEnvironments
	 * @param linktoenvironments
	 */
	public final void setLinkToEnvironments(java.lang.String linktoenvironments)
	{
		setLinkToEnvironments(getContext(), linktoenvironments);
	}

	/**
	 * Set value of LinkToEnvironments
	 * @param context
	 * @param linktoenvironments
	 */
	public final void setLinkToEnvironments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktoenvironments)
	{
		getMendixObject().setValue(context, MemberNames.LinkToEnvironments.toString(), linktoenvironments);
	}

	/**
	 * @return value of LinkToMetrics
	 */
	public final java.lang.String getLinkToMetrics()
	{
		return getLinkToMetrics(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToMetrics
	 */
	public final java.lang.String getLinkToMetrics(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToMetrics.toString());
	}

	/**
	 * Set value of LinkToMetrics
	 * @param linktometrics
	 */
	public final void setLinkToMetrics(java.lang.String linktometrics)
	{
		setLinkToMetrics(getContext(), linktometrics);
	}

	/**
	 * Set value of LinkToMetrics
	 * @param context
	 * @param linktometrics
	 */
	public final void setLinkToMetrics(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktometrics)
	{
		getMendixObject().setValue(context, MemberNames.LinkToMetrics.toString(), linktometrics);
	}

	/**
	 * @return value of LinkToAlerts
	 */
	public final java.lang.String getLinkToAlerts()
	{
		return getLinkToAlerts(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToAlerts
	 */
	public final java.lang.String getLinkToAlerts(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToAlerts.toString());
	}

	/**
	 * Set value of LinkToAlerts
	 * @param linktoalerts
	 */
	public final void setLinkToAlerts(java.lang.String linktoalerts)
	{
		setLinkToAlerts(getContext(), linktoalerts);
	}

	/**
	 * Set value of LinkToAlerts
	 * @param context
	 * @param linktoalerts
	 */
	public final void setLinkToAlerts(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktoalerts)
	{
		getMendixObject().setValue(context, MemberNames.LinkToAlerts.toString(), linktoalerts);
	}

	/**
	 * @return value of LinkToLog
	 */
	public final java.lang.String getLinkToLog()
	{
		return getLinkToLog(getContext());
	}

	/**
	 * @param context
	 * @return value of LinkToLog
	 */
	public final java.lang.String getLinkToLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LinkToLog.toString());
	}

	/**
	 * Set value of LinkToLog
	 * @param linktolog
	 */
	public final void setLinkToLog(java.lang.String linktolog)
	{
		setLinkToLog(getContext(), linktolog);
	}

	/**
	 * Set value of LinkToLog
	 * @param context
	 * @param linktolog
	 */
	public final void setLinkToLog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linktolog)
	{
		getMendixObject().setValue(context, MemberNames.LinkToLog.toString(), linktolog);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return appMendixObject;
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
			final sprintrapis2.proxies.App that = (sprintrapis2.proxies.App) obj;
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
		return "SprintrApis2.App";
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
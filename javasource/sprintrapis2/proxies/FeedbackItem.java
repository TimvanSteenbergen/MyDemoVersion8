// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sprintrapis2.proxies;

public class FeedbackItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject feedbackItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SprintrApis2.FeedbackItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FeedbackItem_App("SprintrApis2.FeedbackItem_App");

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

	public FeedbackItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SprintrApis2.FeedbackItem"));
	}

	protected FeedbackItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject feedbackItemMendixObject)
	{
		if (feedbackItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SprintrApis2.FeedbackItem", feedbackItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SprintrApis2.FeedbackItem");

		this.feedbackItemMendixObject = feedbackItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FeedbackItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sprintrapis2.proxies.FeedbackItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sprintrapis2.proxies.FeedbackItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sprintrapis2.proxies.FeedbackItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sprintrapis2.proxies.FeedbackItem(context, mendixObject);
	}

	public static sprintrapis2.proxies.FeedbackItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sprintrapis2.proxies.FeedbackItem.initialize(context, mendixObject);
	}

	public static java.util.List<sprintrapis2.proxies.FeedbackItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sprintrapis2.proxies.FeedbackItem> result = new java.util.ArrayList<sprintrapis2.proxies.FeedbackItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SprintrApis2.FeedbackItem" + xpathConstraint))
			result.add(sprintrapis2.proxies.FeedbackItem.initialize(context, obj));
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
	 * @return value of FeedbackItem_App
	 */
	public final sprintrapis2.proxies.App getFeedbackItem_App() throws com.mendix.core.CoreException
	{
		return getFeedbackItem_App(getContext());
	}

	/**
	 * @param context
	 * @return value of FeedbackItem_App
	 */
	public final sprintrapis2.proxies.App getFeedbackItem_App(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sprintrapis2.proxies.App result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FeedbackItem_App.toString());
		if (identifier != null)
			result = sprintrapis2.proxies.App.load(context, identifier);
		return result;
	}

	/**
	 * Set value of FeedbackItem_App
	 * @param feedbackitem_app
	 */
	public final void setFeedbackItem_App(sprintrapis2.proxies.App feedbackitem_app)
	{
		setFeedbackItem_App(getContext(), feedbackitem_app);
	}

	/**
	 * Set value of FeedbackItem_App
	 * @param context
	 * @param feedbackitem_app
	 */
	public final void setFeedbackItem_App(com.mendix.systemwideinterfaces.core.IContext context, sprintrapis2.proxies.App feedbackitem_app)
	{
		if (feedbackitem_app == null)
			getMendixObject().setValue(context, MemberNames.FeedbackItem_App.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.FeedbackItem_App.toString(), feedbackitem_app.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return feedbackItemMendixObject;
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
			final sprintrapis2.proxies.FeedbackItem that = (sprintrapis2.proxies.FeedbackItem) obj;
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
		return "SprintrApis2.FeedbackItem";
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
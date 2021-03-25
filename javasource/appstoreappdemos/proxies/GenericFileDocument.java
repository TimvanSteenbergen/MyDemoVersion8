// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appstoreappdemos.proxies;

public class GenericFileDocument extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AppstoreAppDemos.GenericFileDocument";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		GenericFileDocument_User("AppstoreAppDemos.GenericFileDocument_User");

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

	public GenericFileDocument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AppstoreAppDemos.GenericFileDocument"));
	}

	protected GenericFileDocument(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject genericFileDocumentMendixObject)
	{
		super(context, genericFileDocumentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("AppstoreAppDemos.GenericFileDocument", genericFileDocumentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AppstoreAppDemos.GenericFileDocument");
	}

	/**
	 * @deprecated Use 'GenericFileDocument.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static appstoreappdemos.proxies.GenericFileDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return appstoreappdemos.proxies.GenericFileDocument.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static appstoreappdemos.proxies.GenericFileDocument initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new appstoreappdemos.proxies.GenericFileDocument(context, mendixObject);
	}

	public static appstoreappdemos.proxies.GenericFileDocument load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return appstoreappdemos.proxies.GenericFileDocument.initialize(context, mendixObject);
	}

	public static java.util.List<appstoreappdemos.proxies.GenericFileDocument> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<appstoreappdemos.proxies.GenericFileDocument> result = new java.util.ArrayList<appstoreappdemos.proxies.GenericFileDocument>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AppstoreAppDemos.GenericFileDocument" + xpathConstraint))
			result.add(appstoreappdemos.proxies.GenericFileDocument.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of GenericFileDocument_User
	 */
	public final system.proxies.User getGenericFileDocument_User() throws com.mendix.core.CoreException
	{
		return getGenericFileDocument_User(getContext());
	}

	/**
	 * @param context
	 * @return value of GenericFileDocument_User
	 */
	public final system.proxies.User getGenericFileDocument_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.GenericFileDocument_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of GenericFileDocument_User
	 * @param genericfiledocument_user
	 */
	public final void setGenericFileDocument_User(system.proxies.User genericfiledocument_user)
	{
		setGenericFileDocument_User(getContext(), genericfiledocument_user);
	}

	/**
	 * Set value of GenericFileDocument_User
	 * @param context
	 * @param genericfiledocument_user
	 */
	public final void setGenericFileDocument_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User genericfiledocument_user)
	{
		if (genericfiledocument_user == null)
			getMendixObject().setValue(context, MemberNames.GenericFileDocument_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.GenericFileDocument_User.toString(), genericfiledocument_user.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final appstoreappdemos.proxies.GenericFileDocument that = (appstoreappdemos.proxies.GenericFileDocument) obj;
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
		return "AppstoreAppDemos.GenericFileDocument";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
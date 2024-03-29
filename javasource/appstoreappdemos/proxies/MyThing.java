// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appstoreappdemos.proxies;

public class MyThing
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject myThingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AppstoreAppDemos.MyThing";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SomeString("SomeString"),
		MyThing_MyBarcode("AppstoreAppDemos.MyThing_MyBarcode");

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

	public MyThing(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AppstoreAppDemos.MyThing"));
	}

	protected MyThing(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject myThingMendixObject)
	{
		if (myThingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AppstoreAppDemos.MyThing", myThingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AppstoreAppDemos.MyThing");

		this.myThingMendixObject = myThingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MyThing.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static appstoreappdemos.proxies.MyThing initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return appstoreappdemos.proxies.MyThing.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static appstoreappdemos.proxies.MyThing initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new appstoreappdemos.proxies.MyThing(context, mendixObject);
	}

	public static appstoreappdemos.proxies.MyThing load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return appstoreappdemos.proxies.MyThing.initialize(context, mendixObject);
	}

	public static java.util.List<appstoreappdemos.proxies.MyThing> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<appstoreappdemos.proxies.MyThing> result = new java.util.ArrayList<appstoreappdemos.proxies.MyThing>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AppstoreAppDemos.MyThing" + xpathConstraint))
			result.add(appstoreappdemos.proxies.MyThing.initialize(context, obj));
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
	 * @return value of SomeString
	 */
	public final java.lang.String getSomeString()
	{
		return getSomeString(getContext());
	}

	/**
	 * @param context
	 * @return value of SomeString
	 */
	public final java.lang.String getSomeString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SomeString.toString());
	}

	/**
	 * Set value of SomeString
	 * @param somestring
	 */
	public final void setSomeString(java.lang.String somestring)
	{
		setSomeString(getContext(), somestring);
	}

	/**
	 * Set value of SomeString
	 * @param context
	 * @param somestring
	 */
	public final void setSomeString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String somestring)
	{
		getMendixObject().setValue(context, MemberNames.SomeString.toString(), somestring);
	}

	/**
	 * @return value of MyThing_MyBarcode
	 */
	public final appstoreappdemos.proxies.MyBarcode getMyThing_MyBarcode() throws com.mendix.core.CoreException
	{
		return getMyThing_MyBarcode(getContext());
	}

	/**
	 * @param context
	 * @return value of MyThing_MyBarcode
	 */
	public final appstoreappdemos.proxies.MyBarcode getMyThing_MyBarcode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		appstoreappdemos.proxies.MyBarcode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MyThing_MyBarcode.toString());
		if (identifier != null)
			result = appstoreappdemos.proxies.MyBarcode.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MyThing_MyBarcode
	 * @param mything_mybarcode
	 */
	public final void setMyThing_MyBarcode(appstoreappdemos.proxies.MyBarcode mything_mybarcode)
	{
		setMyThing_MyBarcode(getContext(), mything_mybarcode);
	}

	/**
	 * Set value of MyThing_MyBarcode
	 * @param context
	 * @param mything_mybarcode
	 */
	public final void setMyThing_MyBarcode(com.mendix.systemwideinterfaces.core.IContext context, appstoreappdemos.proxies.MyBarcode mything_mybarcode)
	{
		if (mything_mybarcode == null)
			getMendixObject().setValue(context, MemberNames.MyThing_MyBarcode.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MyThing_MyBarcode.toString(), mything_mybarcode.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return myThingMendixObject;
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
			final appstoreappdemos.proxies.MyThing that = (appstoreappdemos.proxies.MyThing) obj;
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
		return "AppstoreAppDemos.MyThing";
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

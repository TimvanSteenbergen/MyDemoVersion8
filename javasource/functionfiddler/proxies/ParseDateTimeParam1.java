// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package functionfiddler.proxies;

public class ParseDateTimeParam1
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject parseDateTimeParam1MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FunctionFiddler.ParseDateTimeParam1";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateTimeString("DateTimeString");

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

	public ParseDateTimeParam1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "FunctionFiddler.ParseDateTimeParam1"));
	}

	protected ParseDateTimeParam1(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject parseDateTimeParam1MendixObject)
	{
		if (parseDateTimeParam1MendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("FunctionFiddler.ParseDateTimeParam1", parseDateTimeParam1MendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a FunctionFiddler.ParseDateTimeParam1");

		this.parseDateTimeParam1MendixObject = parseDateTimeParam1MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ParseDateTimeParam1.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static functionfiddler.proxies.ParseDateTimeParam1 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return functionfiddler.proxies.ParseDateTimeParam1.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static functionfiddler.proxies.ParseDateTimeParam1 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new functionfiddler.proxies.ParseDateTimeParam1(context, mendixObject);
	}

	public static functionfiddler.proxies.ParseDateTimeParam1 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return functionfiddler.proxies.ParseDateTimeParam1.initialize(context, mendixObject);
	}

	public static java.util.List<functionfiddler.proxies.ParseDateTimeParam1> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<functionfiddler.proxies.ParseDateTimeParam1> result = new java.util.ArrayList<functionfiddler.proxies.ParseDateTimeParam1>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//FunctionFiddler.ParseDateTimeParam1" + xpathConstraint))
			result.add(functionfiddler.proxies.ParseDateTimeParam1.initialize(context, obj));
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
	 * @return value of DateTimeString
	 */
	public final java.lang.String getDateTimeString()
	{
		return getDateTimeString(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTimeString
	 */
	public final java.lang.String getDateTimeString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DateTimeString.toString());
	}

	/**
	 * Set value of DateTimeString
	 * @param datetimestring
	 */
	public final void setDateTimeString(java.lang.String datetimestring)
	{
		setDateTimeString(getContext(), datetimestring);
	}

	/**
	 * Set value of DateTimeString
	 * @param context
	 * @param datetimestring
	 */
	public final void setDateTimeString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String datetimestring)
	{
		getMendixObject().setValue(context, MemberNames.DateTimeString.toString(), datetimestring);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return parseDateTimeParam1MendixObject;
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
			final functionfiddler.proxies.ParseDateTimeParam1 that = (functionfiddler.proxies.ParseDateTimeParam1) obj;
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
		return "FunctionFiddler.ParseDateTimeParam1";
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
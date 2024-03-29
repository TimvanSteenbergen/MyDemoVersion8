// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasewriteerrors.proxies;

public class WriteMe
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject writeMeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseWriteErrors.WriteMe";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Number("Number"),
		Date("Date");

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

	public WriteMe(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseWriteErrors.WriteMe"));
	}

	protected WriteMe(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject writeMeMendixObject)
	{
		if (writeMeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseWriteErrors.WriteMe", writeMeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseWriteErrors.WriteMe");

		this.writeMeMendixObject = writeMeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WriteMe.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static databasewriteerrors.proxies.WriteMe initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasewriteerrors.proxies.WriteMe.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static databasewriteerrors.proxies.WriteMe initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasewriteerrors.proxies.WriteMe(context, mendixObject);
	}

	public static databasewriteerrors.proxies.WriteMe load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasewriteerrors.proxies.WriteMe.initialize(context, mendixObject);
	}

	public static java.util.List<databasewriteerrors.proxies.WriteMe> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasewriteerrors.proxies.WriteMe> result = new java.util.ArrayList<databasewriteerrors.proxies.WriteMe>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseWriteErrors.WriteMe" + xpathConstraint))
			result.add(databasewriteerrors.proxies.WriteMe.initialize(context, obj));
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
	 * @return value of Number
	 */
	public final java.math.BigDecimal getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.math.BigDecimal getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.math.BigDecimal number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return writeMeMendixObject;
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
			final databasewriteerrors.proxies.WriteMe that = (databasewriteerrors.proxies.WriteMe) obj;
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
		return "DatabaseWriteErrors.WriteMe";
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

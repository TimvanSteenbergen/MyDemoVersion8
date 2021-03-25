// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testjson.proxies;

public class Table
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tableMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "testjson.Table";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NumberOfRows("NumberOfRows"),
		NumberOfColumns("NumberOfColumns");

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

	public Table(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "testjson.Table"));
	}

	protected Table(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tableMendixObject)
	{
		if (tableMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("testjson.Table", tableMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a testjson.Table");

		this.tableMendixObject = tableMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Table.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static testjson.proxies.Table initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testjson.proxies.Table.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testjson.proxies.Table initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testjson.proxies.Table(context, mendixObject);
	}

	public static testjson.proxies.Table load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testjson.proxies.Table.initialize(context, mendixObject);
	}

	public static java.util.List<testjson.proxies.Table> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testjson.proxies.Table> result = new java.util.ArrayList<testjson.proxies.Table>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//testjson.Table" + xpathConstraint))
			result.add(testjson.proxies.Table.initialize(context, obj));
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
	 * @return value of NumberOfRows
	 */
	public final java.lang.Integer getNumberOfRows()
	{
		return getNumberOfRows(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfRows
	 */
	public final java.lang.Integer getNumberOfRows(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfRows.toString());
	}

	/**
	 * Set value of NumberOfRows
	 * @param numberofrows
	 */
	public final void setNumberOfRows(java.lang.Integer numberofrows)
	{
		setNumberOfRows(getContext(), numberofrows);
	}

	/**
	 * Set value of NumberOfRows
	 * @param context
	 * @param numberofrows
	 */
	public final void setNumberOfRows(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofrows)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfRows.toString(), numberofrows);
	}

	/**
	 * @return value of NumberOfColumns
	 */
	public final java.lang.Integer getNumberOfColumns()
	{
		return getNumberOfColumns(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfColumns
	 */
	public final java.lang.Integer getNumberOfColumns(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfColumns.toString());
	}

	/**
	 * Set value of NumberOfColumns
	 * @param numberofcolumns
	 */
	public final void setNumberOfColumns(java.lang.Integer numberofcolumns)
	{
		setNumberOfColumns(getContext(), numberofcolumns);
	}

	/**
	 * Set value of NumberOfColumns
	 * @param context
	 * @param numberofcolumns
	 */
	public final void setNumberOfColumns(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofcolumns)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfColumns.toString(), numberofcolumns);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tableMendixObject;
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
			final testjson.proxies.Table that = (testjson.proxies.Table) obj;
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
		return "testjson.Table";
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
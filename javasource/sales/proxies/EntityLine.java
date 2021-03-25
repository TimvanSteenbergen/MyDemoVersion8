// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sales.proxies;

public class EntityLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject entityLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Sales.EntityLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Linename("Linename"),
		EntityLine_Entity("Sales.EntityLine_Entity");

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

	public EntityLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Sales.EntityLine"));
	}

	protected EntityLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject entityLineMendixObject)
	{
		if (entityLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Sales.EntityLine", entityLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Sales.EntityLine");

		this.entityLineMendixObject = entityLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'EntityLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sales.proxies.EntityLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sales.proxies.EntityLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sales.proxies.EntityLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sales.proxies.EntityLine(context, mendixObject);
	}

	public static sales.proxies.EntityLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sales.proxies.EntityLine.initialize(context, mendixObject);
	}

	public static java.util.List<sales.proxies.EntityLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sales.proxies.EntityLine> result = new java.util.ArrayList<sales.proxies.EntityLine>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Sales.EntityLine" + xpathConstraint))
			result.add(sales.proxies.EntityLine.initialize(context, obj));
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
	 * @return value of Linename
	 */
	public final java.lang.String getLinename()
	{
		return getLinename(getContext());
	}

	/**
	 * @param context
	 * @return value of Linename
	 */
	public final java.lang.String getLinename(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Linename.toString());
	}

	/**
	 * Set value of Linename
	 * @param linename
	 */
	public final void setLinename(java.lang.String linename)
	{
		setLinename(getContext(), linename);
	}

	/**
	 * Set value of Linename
	 * @param context
	 * @param linename
	 */
	public final void setLinename(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String linename)
	{
		getMendixObject().setValue(context, MemberNames.Linename.toString(), linename);
	}

	/**
	 * @return value of EntityLine_Entity
	 */
	public final sales.proxies.Entity getEntityLine_Entity() throws com.mendix.core.CoreException
	{
		return getEntityLine_Entity(getContext());
	}

	/**
	 * @param context
	 * @return value of EntityLine_Entity
	 */
	public final sales.proxies.Entity getEntityLine_Entity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sales.proxies.Entity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.EntityLine_Entity.toString());
		if (identifier != null)
			result = sales.proxies.Entity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of EntityLine_Entity
	 * @param entityline_entity
	 */
	public final void setEntityLine_Entity(sales.proxies.Entity entityline_entity)
	{
		setEntityLine_Entity(getContext(), entityline_entity);
	}

	/**
	 * Set value of EntityLine_Entity
	 * @param context
	 * @param entityline_entity
	 */
	public final void setEntityLine_Entity(com.mendix.systemwideinterfaces.core.IContext context, sales.proxies.Entity entityline_entity)
	{
		if (entityline_entity == null)
			getMendixObject().setValue(context, MemberNames.EntityLine_Entity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.EntityLine_Entity.toString(), entityline_entity.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return entityLineMendixObject;
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
			final sales.proxies.EntityLine that = (sales.proxies.EntityLine) obj;
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
		return "Sales.EntityLine";
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
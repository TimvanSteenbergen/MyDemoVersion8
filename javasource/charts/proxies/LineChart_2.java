// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package charts.proxies;

public class LineChart_2 extends charts.proxies.Serie
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Charts.LineChart_2";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Charttype("Charttype"),
		Data("Data"),
		DataPoint_Serie("Charts.DataPoint_Serie"),
		Serie_Chart("Charts.Serie_Chart");

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

	public LineChart_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Charts.LineChart_2"));
	}

	protected LineChart_2(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject lineChart_2MendixObject)
	{
		super(context, lineChart_2MendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Charts.LineChart_2", lineChart_2MendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Charts.LineChart_2");
	}

	/**
	 * @deprecated Use 'LineChart_2.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static charts.proxies.LineChart_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return charts.proxies.LineChart_2.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static charts.proxies.LineChart_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new charts.proxies.LineChart_2(context, mendixObject);
	}

	public static charts.proxies.LineChart_2 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return charts.proxies.LineChart_2.initialize(context, mendixObject);
	}

	public static java.util.List<charts.proxies.LineChart_2> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<charts.proxies.LineChart_2> result = new java.util.ArrayList<charts.proxies.LineChart_2>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Charts.LineChart_2" + xpathConstraint))
			result.add(charts.proxies.LineChart_2.initialize(context, obj));
		return result;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final charts.proxies.LineChart_2 that = (charts.proxies.LineChart_2) obj;
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
		return "Charts.LineChart_2";
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

// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package charts.proxies;

public class Serie
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject serieMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Charts.Serie";

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

	public Serie(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Charts.Serie"));
	}

	protected Serie(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject serieMendixObject)
	{
		if (serieMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Charts.Serie", serieMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Charts.Serie");

		this.serieMendixObject = serieMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Serie.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static charts.proxies.Serie initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return charts.proxies.Serie.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static charts.proxies.Serie initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("Charts.AreaChart", mendixObject.getType()))
			return charts.proxies.AreaChart.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Charts.BarChart", mendixObject.getType()))
			return charts.proxies.BarChart.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Charts.LineChart", mendixObject.getType()))
			return charts.proxies.LineChart.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Charts.LineChart_2", mendixObject.getType()))
			return charts.proxies.LineChart_2.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("Charts.PieChart", mendixObject.getType()))
			return charts.proxies.PieChart.initialize(context, mendixObject);

		return new charts.proxies.Serie(context, mendixObject);
	}

	public static charts.proxies.Serie load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return charts.proxies.Serie.initialize(context, mendixObject);
	}

	public static java.util.List<? extends charts.proxies.Serie> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<charts.proxies.Serie> result = new java.util.ArrayList<charts.proxies.Serie>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Charts.Serie" + xpathConstraint))
			result.add(charts.proxies.Serie.initialize(context, obj));
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
	 * Set value of Charttype
	 * @param charttype
	 */
	public final charts.proxies.Enum_BasicChartType getCharttype()
	{
		return getCharttype(getContext());
	}

	/**
	 * @param context
	 * @return value of Charttype
	 */
	public final charts.proxies.Enum_BasicChartType getCharttype(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Charttype.toString());
		if (obj == null)
			return null;

		return charts.proxies.Enum_BasicChartType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Charttype
	 * @param charttype
	 */
	public final void setCharttype(charts.proxies.Enum_BasicChartType charttype)
	{
		setCharttype(getContext(), charttype);
	}

	/**
	 * Set value of Charttype
	 * @param context
	 * @param charttype
	 */
	public final void setCharttype(com.mendix.systemwideinterfaces.core.IContext context, charts.proxies.Enum_BasicChartType charttype)
	{
		if (charttype != null)
			getMendixObject().setValue(context, MemberNames.Charttype.toString(), charttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.Charttype.toString(), null);
	}

	/**
	 * @return value of Data
	 */
	public final java.lang.String getData()
	{
		return getData(getContext());
	}

	/**
	 * @param context
	 * @return value of Data
	 */
	public final java.lang.String getData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Data.toString());
	}

	/**
	 * Set value of Data
	 * @param data
	 */
	public final void setData(java.lang.String data)
	{
		setData(getContext(), data);
	}

	/**
	 * Set value of Data
	 * @param context
	 * @param data
	 */
	public final void setData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String data)
	{
		getMendixObject().setValue(context, MemberNames.Data.toString(), data);
	}

	/**
	 * @return value of DataPoint_Serie
	 */
	public final java.util.List<charts.proxies.DataPoint> getDataPoint_Serie() throws com.mendix.core.CoreException
	{
		return getDataPoint_Serie(getContext());
	}

	/**
	 * @param context
	 * @return value of DataPoint_Serie
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<charts.proxies.DataPoint> getDataPoint_Serie(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<charts.proxies.DataPoint> result = new java.util.ArrayList<charts.proxies.DataPoint>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.DataPoint_Serie.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(charts.proxies.DataPoint.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of DataPoint_Serie
	 * @param datapoint_serie
	 */
	public final void setDataPoint_Serie(java.util.List<charts.proxies.DataPoint> datapoint_serie)
	{
		setDataPoint_Serie(getContext(), datapoint_serie);
	}

	/**
	 * Set value of DataPoint_Serie
	 * @param context
	 * @param datapoint_serie
	 */
	public final void setDataPoint_Serie(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<charts.proxies.DataPoint> datapoint_serie)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (charts.proxies.DataPoint proxyObject : datapoint_serie)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.DataPoint_Serie.toString(), identifiers);
	}

	/**
	 * @return value of Serie_Chart
	 */
	public final java.util.List<charts.proxies.Chart> getSerie_Chart() throws com.mendix.core.CoreException
	{
		return getSerie_Chart(getContext());
	}

	/**
	 * @param context
	 * @return value of Serie_Chart
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<charts.proxies.Chart> getSerie_Chart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<charts.proxies.Chart> result = new java.util.ArrayList<charts.proxies.Chart>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Serie_Chart.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(charts.proxies.Chart.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Serie_Chart
	 * @param serie_chart
	 */
	public final void setSerie_Chart(java.util.List<charts.proxies.Chart> serie_chart)
	{
		setSerie_Chart(getContext(), serie_chart);
	}

	/**
	 * Set value of Serie_Chart
	 * @param context
	 * @param serie_chart
	 */
	public final void setSerie_Chart(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<charts.proxies.Chart> serie_chart)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (charts.proxies.Chart proxyObject : serie_chart)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Serie_Chart.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return serieMendixObject;
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
			final charts.proxies.Serie that = (charts.proxies.Serie) obj;
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
		return "Charts.Serie";
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
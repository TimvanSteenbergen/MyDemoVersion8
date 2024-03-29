// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package charts.proxies;

/**
 * For ChartJs
 */
public class CJsChart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject cJsChartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Charts.CJsChart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		yMin("yMin"),
		yMax("yMax"),
		CJsChart_CJsDataset("Charts.CJsChart_CJsDataset");

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

	public CJsChart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Charts.CJsChart"));
	}

	protected CJsChart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject cJsChartMendixObject)
	{
		if (cJsChartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Charts.CJsChart", cJsChartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Charts.CJsChart");

		this.cJsChartMendixObject = cJsChartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'CJsChart.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static charts.proxies.CJsChart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return charts.proxies.CJsChart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static charts.proxies.CJsChart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new charts.proxies.CJsChart(context, mendixObject);
	}

	public static charts.proxies.CJsChart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return charts.proxies.CJsChart.initialize(context, mendixObject);
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
	 * @return value of yMin
	 */
	public final java.lang.Integer getyMin()
	{
		return getyMin(getContext());
	}

	/**
	 * @param context
	 * @return value of yMin
	 */
	public final java.lang.Integer getyMin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.yMin.toString());
	}

	/**
	 * Set value of yMin
	 * @param ymin
	 */
	public final void setyMin(java.lang.Integer ymin)
	{
		setyMin(getContext(), ymin);
	}

	/**
	 * Set value of yMin
	 * @param context
	 * @param ymin
	 */
	public final void setyMin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ymin)
	{
		getMendixObject().setValue(context, MemberNames.yMin.toString(), ymin);
	}

	/**
	 * @return value of yMax
	 */
	public final java.lang.Integer getyMax()
	{
		return getyMax(getContext());
	}

	/**
	 * @param context
	 * @return value of yMax
	 */
	public final java.lang.Integer getyMax(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.yMax.toString());
	}

	/**
	 * Set value of yMax
	 * @param ymax
	 */
	public final void setyMax(java.lang.Integer ymax)
	{
		setyMax(getContext(), ymax);
	}

	/**
	 * Set value of yMax
	 * @param context
	 * @param ymax
	 */
	public final void setyMax(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer ymax)
	{
		getMendixObject().setValue(context, MemberNames.yMax.toString(), ymax);
	}

	/**
	 * @return value of CJsChart_CJsDataset
	 */
	public final java.util.List<charts.proxies.CJsDataset> getCJsChart_CJsDataset() throws com.mendix.core.CoreException
	{
		return getCJsChart_CJsDataset(getContext());
	}

	/**
	 * @param context
	 * @return value of CJsChart_CJsDataset
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<charts.proxies.CJsDataset> getCJsChart_CJsDataset(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<charts.proxies.CJsDataset> result = new java.util.ArrayList<charts.proxies.CJsDataset>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.CJsChart_CJsDataset.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(charts.proxies.CJsDataset.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of CJsChart_CJsDataset
	 * @param cjschart_cjsdataset
	 */
	public final void setCJsChart_CJsDataset(java.util.List<charts.proxies.CJsDataset> cjschart_cjsdataset)
	{
		setCJsChart_CJsDataset(getContext(), cjschart_cjsdataset);
	}

	/**
	 * Set value of CJsChart_CJsDataset
	 * @param context
	 * @param cjschart_cjsdataset
	 */
	public final void setCJsChart_CJsDataset(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<charts.proxies.CJsDataset> cjschart_cjsdataset)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (charts.proxies.CJsDataset proxyObject : cjschart_cjsdataset)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.CJsChart_CJsDataset.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return cJsChartMendixObject;
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
			final charts.proxies.CJsChart that = (charts.proxies.CJsChart) obj;
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
		return "Charts.CJsChart";
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

// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sales.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Sales module
	public static void act_Address_SaveChanges(IContext context, sales.proxies.Address _address, sales.proxies.Customer _customer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Address", _address == null ? null : _address.getMendixObject());
		params.put("Customer", _customer == null ? null : _customer.getMendixObject());
		Core.microflowCall("Sales.Act_Address_SaveChanges").withParams(params).execute(context);
	}
	public static void act_Customer_CreateAddress(IContext context, sales.proxies.Customer _customer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Customer", _customer == null ? null : _customer.getMendixObject());
		Core.microflowCall("Sales.Act_Customer_CreateAddress").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_01(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_01").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_02(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_02").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_03(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_03").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_03_IsPaidisFalse(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_03_IsPaidisFalse").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_04(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_04").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_05_CountSum(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_05_CountSum").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_06_AdultsOnly(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_06_AdultsOnly").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_07_OrdersBeforeDate(IContext context, oql.proxies.Query _query, sales.proxies.QueryParams _queryParams)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		params.put("QueryParams", _queryParams == null ? null : _queryParams.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_07_OrdersBeforeDate").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_07_OrdersBeforeDateTime(IContext context, oql.proxies.Query _query, sales.proxies.QueryParams _queryParams)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		params.put("QueryParams", _queryParams == null ? null : _queryParams.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_07_OrdersBeforeDateTime").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_08_Where_with_Subquery(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_08_Where_with_Subquery").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_09_UNION(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_09_UNION").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_10_CustomersWithoutOrders(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_10_CustomersWithoutOrders").withParams(params).execute(context);
	}
	public static void act_OQL_ExecExample_11_CustomersWithMoreThan1Order(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.Act_OQL_ExecExample_11_CustomersWithMoreThan1Order").withParams(params).execute(context);
	}
	public static void act_Order_CreateAddress(IContext context, sales.proxies.Order _order)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Order", _order == null ? null : _order.getMendixObject());
		Core.microflowCall("Sales.Act_Order_CreateAddress").withParams(params).execute(context);
	}
	public static sales.proxies.QueryParams dS_OQL_CreateParameters(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Sales.DS_OQL_CreateParameters").withParams(params).execute(context);
		return result == null ? null : sales.proxies.QueryParams.initialize(context, result);
	}
	public static void sQL_ExecuteWithLogging(IContext context, oql.proxies.Query _query)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Query", _query == null ? null : _query.getMendixObject());
		Core.microflowCall("Sales.SQL_ExecuteWithLogging").withParams(params).execute(context);
	}
}
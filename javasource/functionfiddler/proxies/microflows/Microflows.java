// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package functionfiddler.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the FunctionFiddler module
	public static java.util.Date maxDate(IContext context, functionfiddler.proxies.MinMaxTest _minMaxTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MinMaxTest", _minMaxTest == null ? null : _minMaxTest.getMendixObject());
		return (java.util.Date) Core.microflowCall("FunctionFiddler.MaxDate").withParams(params).execute(context);
	}
	public static java.lang.Long maxInt(IContext context, functionfiddler.proxies.MinMaxTest _minMaxTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MinMaxTest", _minMaxTest == null ? null : _minMaxTest.getMendixObject());
		return (java.lang.Long) Core.microflowCall("FunctionFiddler.MaxInt").withParams(params).execute(context);
	}
	public static void microflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.Microflow").withParams(params).execute(context);
	}
	public static java.util.Date minDate(IContext context, functionfiddler.proxies.MinMaxTest _minMaxTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MinMaxTest", _minMaxTest == null ? null : _minMaxTest.getMendixObject());
		return (java.util.Date) Core.microflowCall("FunctionFiddler.MinDate").withParams(params).execute(context);
	}
	public static java.lang.Long minInt(IContext context, functionfiddler.proxies.MinMaxTest _minMaxTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MinMaxTest", _minMaxTest == null ? null : _minMaxTest.getMendixObject());
		return (java.lang.Long) Core.microflowCall("FunctionFiddler.MinInt").withParams(params).execute(context);
	}
	public static void sUB_addDays(IContext context, java.lang.Long _numberOfDays, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfDays", _numberOfDays);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addDays").withParams(params).execute(context);
	}
	public static void sUB_AddDays_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_AddDays_RecreateFunctionResults").withParams(params).execute(context);
	}
	public static void sUB_addDaysUTC(IContext context, java.lang.Long _numberOfDays, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfDays", _numberOfDays);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addDaysUTC").withParams(params).execute(context);
	}
	public static void sUB_addHours(IContext context, java.lang.Long _numberOfHours, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfHours", _numberOfHours);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addHours").withParams(params).execute(context);
	}
	public static void sUB_addMilliseconds(IContext context, java.lang.Long _numberOfMilliseconds, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfMilliseconds", _numberOfMilliseconds);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addMilliseconds").withParams(params).execute(context);
	}
	public static void sUB_addMinutes(IContext context, java.lang.Long _numberOfMinutes, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfMinutes", _numberOfMinutes);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addMinutes").withParams(params).execute(context);
	}
	public static void sUB_addMonths(IContext context, java.lang.Long _numberOfMonths, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfMonths", _numberOfMonths);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addMonths").withParams(params).execute(context);
	}
	public static void sUB_addMonthsUTC(IContext context, java.lang.Long _numberOfMonths, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfMonths", _numberOfMonths);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addMonthsUTC").withParams(params).execute(context);
	}
	public static void sUB_addSeconds(IContext context, java.lang.Long _numberOfSeconds, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfSeconds", _numberOfSeconds);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addSeconds").withParams(params).execute(context);
	}
	public static void sUB_addWeeks(IContext context, java.lang.Long _numberOfWeeks, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfWeeks", _numberOfWeeks);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addWeeks").withParams(params).execute(context);
	}
	public static void sUB_addWeeksUTC(IContext context, java.lang.Long _numberOfWeeks, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfWeeks", _numberOfWeeks);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addWeeksUTC").withParams(params).execute(context);
	}
	public static void sUB_addYears(IContext context, java.lang.Long _numberOfYears, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfYears", _numberOfYears);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addYears").withParams(params).execute(context);
	}
	public static void sUB_addYearsUTC(IContext context, java.lang.Long _numberOfYears, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NumberOfYears", _numberOfYears);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_addYearsUTC").withParams(params).execute(context);
	}
	public static void sUB_ExtractFirstRegexMatch(IContext context, java.lang.String _stringToCheck, java.lang.String _regex)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StringToCheck", _stringToCheck);
		params.put("Regex", _regex);
		Core.microflowCall("FunctionFiddler.SUB_ExtractFirstRegexMatch").withParams(params).execute(context);
	}
	public static void sUB_ExtractSubstringFromString(IContext context, java.lang.String _parameter_1, java.lang.Long _parameter_2, java.lang.Long _parameter_3)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Parameter_1", _parameter_1);
		params.put("Parameter_2", _parameter_2);
		params.put("Parameter_3", _parameter_3);
		Core.microflowCall("FunctionFiddler.SUB_ExtractSubstringFromString").withParams(params).execute(context);
	}
	public static void sUB_FormatDateTime(IContext context, java.lang.String _format, java.util.Date _dateTime)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Format", _format);
		params.put("DateTime", _dateTime);
		Core.microflowCall("FunctionFiddler.SUB_FormatDateTime").withParams(params).execute(context);
	}
	public static void sUB_FormatDateTime_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_FormatDateTime_RecreateFunctionResults").withParams(params).execute(context);
	}
	public static void sUB_IsMatch_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_IsMatch_RecreateFunctionResults").withParams(params).execute(context);
	}
	public static void sUB_ParseDateTime(IContext context, java.lang.String _dateTimeAsString, java.lang.String _format)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("DateTimeAsString", _dateTimeAsString);
		params.put("Format", _format);
		Core.microflowCall("FunctionFiddler.SUB_ParseDateTime").withParams(params).execute(context);
	}
	public static void sUB_ParseDateTime_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_ParseDateTime_RecreateFunctionResults").withParams(params).execute(context);
	}
	public static void sUB_ParseInteger(IContext context, java.lang.String _inputString)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("InputString", _inputString);
		Core.microflowCall("FunctionFiddler.SUB_ParseInteger").withParams(params).execute(context);
	}
	public static void sUB_ParseInteger_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_ParseInteger_RecreateFunctionResults").withParams(params).execute(context);
	}
	public static void sUB_SubString_RecreateFunctionResults(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("FunctionFiddler.SUB_SubString_RecreateFunctionResults").withParams(params).execute(context);
	}
}
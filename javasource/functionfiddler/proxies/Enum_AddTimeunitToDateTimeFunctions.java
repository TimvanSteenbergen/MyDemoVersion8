// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package functionfiddler.proxies;

public enum Enum_AddTimeunitToDateTimeFunctions
{
	addMilliseconds(new java.lang.String[][] { new java.lang.String[] { "en_US", "addMilliseconds" }, new java.lang.String[] { "nl_NL", "addMilliseconds" } }),
	addSeconds(new java.lang.String[][] { new java.lang.String[] { "en_US", "addSeconds" }, new java.lang.String[] { "nl_NL", "addSeconds" } }),
	addMinutes(new java.lang.String[][] { new java.lang.String[] { "en_US", "addMinutes" }, new java.lang.String[] { "nl_NL", "addMinutes" } }),
	addHours(new java.lang.String[][] { new java.lang.String[] { "en_US", "addHours" }, new java.lang.String[] { "nl_NL", "addHours" } }),
	addDays(new java.lang.String[][] { new java.lang.String[] { "en_US", "addDays" }, new java.lang.String[] { "nl_NL", "addDays" } }),
	addDaysUTC(new java.lang.String[][] { new java.lang.String[] { "en_US", "addDaysUTC" }, new java.lang.String[] { "nl_NL", "addDaysUTC" } }),
	addWeeks(new java.lang.String[][] { new java.lang.String[] { "en_US", "addWeeks" }, new java.lang.String[] { "nl_NL", "addWeeks" } }),
	addWeeksUTC(new java.lang.String[][] { new java.lang.String[] { "en_US", "addWeeksUTC" }, new java.lang.String[] { "nl_NL", "addWeeksUTC" } }),
	addMonths(new java.lang.String[][] { new java.lang.String[] { "en_US", "addMonths" }, new java.lang.String[] { "nl_NL", "addMonths" } }),
	addMonthsUTC(new java.lang.String[][] { new java.lang.String[] { "en_US", "addMonthsUTC" }, new java.lang.String[] { "nl_NL", "addMonthsUTC" } }),
	addYears(new java.lang.String[][] { new java.lang.String[] { "en_US", "addYears" }, new java.lang.String[] { "nl_NL", "addYears" } }),
	addYearsUTC(new java.lang.String[][] { new java.lang.String[] { "en_US", "addYearsUTC" }, new java.lang.String[] { "nl_NL", "addYearsUTC" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_AddTimeunitToDateTimeFunctions(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}

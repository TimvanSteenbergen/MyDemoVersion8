// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sprintrapis2.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the SprintrApis2 module

	/**
	* https://cloud.home.mendix.com
	*/
	public static java.lang.String getBaseUrlMendixCloud()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("SprintrApis2.BaseUrlMendixCloud");
	}

	public static java.lang.String getBaseUrlSprintr()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("SprintrApis2.BaseUrlSprintr");
	}
}
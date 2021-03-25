// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package systemmanagement.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the SystemManagement module
	public static void act_PasswordHelper_ChangeUserAccountsPassword(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		Core.microflowCall("SystemManagement.Act_PasswordHelper_ChangeUserAccountsPassword").withParams(params).execute(context);
	}
	public static void act_PasswordHelper_EditUserAccount(IContext context, system.proxies.User _userAccount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserAccount", _userAccount == null ? null : _userAccount.getMendixObject());
		Core.microflowCall("SystemManagement.Act_PasswordHelper_EditUserAccount").withParams(params).execute(context);
	}
	public static boolean act_PasswordHelper_NewAndConfirmPasswordsValidate(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("SystemManagement.Act_PasswordHelper_NewAndConfirmPasswordsValidate").withParams(params).execute(context);
	}
	public static void act_PasswordHelper_NewPassword_Validate(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		Core.microflowCall("SystemManagement.Act_PasswordHelper_NewPassword_Validate").withParams(params).execute(context);
	}
	public static void act_PasswordHelper_SetUserAccountsPassword(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		Core.microflowCall("SystemManagement.Act_PasswordHelper_SetUserAccountsPassword").withParams(params).execute(context);
	}
	public static void act_UserAccount_CreateAndShowPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("SystemManagement.Act_UserAccount_CreateAndShowPage").withParams(params).execute(context);
	}
	/**
	 * Create a new user object and change the default attribute values so the user will be handled as a webservice user.
	 * Finally open the User_NewEdit form so all remaing user information can be set.
	 */
	public static void act_UserAccount_CreateOfTypeWebservice(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("SystemManagement.Act_UserAccount_CreateOfTypeWebservice").withParams(params).execute(context);
	}
	public static void act_UserAccount_Delete(IContext context, system.proxies.User _userAccount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserAccount", _userAccount == null ? null : _userAccount.getMendixObject());
		Core.microflowCall("SystemManagement.Act_UserAccount_Delete").withParams(params).execute(context);
	}
	public static void act_UserAccount_OldPassword_Verify(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		Core.microflowCall("SystemManagement.Act_UserAccount_OldPassword_Verify").withParams(params).execute(context);
	}
	public static void act_UserAccount_Save(IContext context, systemmanagement.proxies.PasswordHelper _passwordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordHelper", _passwordHelper == null ? null : _passwordHelper.getMendixObject());
		Core.microflowCall("SystemManagement.Act_UserAccount_Save").withParams(params).execute(context);
	}
	public static java.util.List<systemmanagement.proxies.CountHelper> dS_Languages_OverviewWithUseraccountCount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("SystemManagement.DS_Languages_OverviewWithUseraccountCount").withParams(params).execute(context);
		java.util.List<systemmanagement.proxies.CountHelper> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(systemmanagement.proxies.CountHelper.initialize(context, obj));
		}
		return result;
	}
	public static system.proxies.User dS_UserAccount_GetCurrentUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("SystemManagement.DS_UserAccount_GetCurrentUser").withParams(params).execute(context);
		return result == null ? null : system.proxies.User.initialize(context, result);
	}
	public static systemmanagement.proxies.PasswordHelper dS_UserAccount_ShowMyAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("SystemManagement.DS_UserAccount_ShowMyAccount").withParams(params).execute(context);
		return result == null ? null : systemmanagement.proxies.PasswordHelper.initialize(context, result);
	}
	public static java.util.List<system.proxies.UserRole> dS_UserRole_ReadGrantableRoles(IContext context, system.proxies.UserRole _userRole)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserRole", _userRole == null ? null : _userRole.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("SystemManagement.DS_UserRole_ReadGrantableRoles").withParams(params).execute(context);
		java.util.List<system.proxies.UserRole> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.UserRole.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<system.proxies.User> dS_UserRole_ShowUserAccounts(IContext context, system.proxies.UserRole _userRole)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserRole", _userRole == null ? null : _userRole.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("SystemManagement.DS_UserRole_ShowUserAccounts").withParams(params).execute(context);
		java.util.List<system.proxies.User> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.User.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<systemmanagement.proxies.CountHelper> dS_UserRoles_OverviewWithUseraccountCount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("SystemManagement.DS_UserRoles_OverviewWithUseraccountCount").withParams(params).execute(context);
		java.util.List<systemmanagement.proxies.CountHelper> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(systemmanagement.proxies.CountHelper.initialize(context, obj));
		}
		return result;
	}
	public static java.lang.String password_ValidateAgainstProjectPasswordPolicy(IContext context, java.lang.String _password)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Password", _password);
		return (java.lang.String) Core.microflowCall("SystemManagement.Password_ValidateAgainstProjectPasswordPolicy").withParams(params).execute(context);
	}
	public static java.lang.String passwordGenerate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("SystemManagement.PasswordGenerate").withParams(params).execute(context);
	}
}
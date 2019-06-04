package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(forumquestions.actions.endTransaction.class);
    registrator.registerUserAction(forumquestions.actions.rollbackTransaction.class);
    registrator.registerUserAction(forumquestions.actions.startTransaction.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}

package Scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.CRM_LoginPage;
import pom.HomePage;

@Listeners(genericLibraries.ImplementListeners.class)

public class SignInSignOut extends BaseClass
{
	@Test
	public void signinout() 
	{
		CRM_LoginPage clog = new CRM_LoginPage(driver);
		clog.giveUsername();
		clog.givePassword();
		clog.clickLogin();
		
		Assert.fail();
		
		HomePage home = new HomePage(driver);
		utilies.mouseHover(driver, home.getSignoutMouseHover());
		home.getSignOutBtn().click();
		
	}
}

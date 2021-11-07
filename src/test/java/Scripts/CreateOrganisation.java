package Scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import junit.framework.Assert;
import pom.CRM_LoginPage;
import pom.HomePage;
import pom.OrganisationPage;
import pom.OrganisationinformationPage;
import pom.RegisterNewOrganisation;
import pom.RegisterNewOrganisation;

public class CreateOrganisation extends BaseClass
{
	@Test
	public void createOrganistion() throws Throwable 
	{
		CRM_LoginPage clog = new CRM_LoginPage(driver);
		clog.giveUsername();
		clog.givePassword();
		clog.clickLogin();
		
		HomePage home = new HomePage(driver);
		home.clickOrganisation();
		
		OrganisationPage org = new OrganisationPage(driver);
		org.clickCreateOrganisation();
		
		RegisterNewOrganisation register = new RegisterNewOrganisation(driver);
		register.giveValues();
		register.save();
		
		Thread.sleep(2000);
		
		OrganisationinformationPage orginfo = new OrganisationinformationPage(driver);
		String finalOrginfo = orginfo.getOrganisationText().getText();
		
		Assert.assertEquals("Organizations", finalOrginfo );
	}
}

package Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.CRM_LoginPage;
import pom.Contacts;
import pom.ContactsInfo;
import pom.ContactsToOrgPopup;
import pom.HomePage;

public class CreateContactWithOrganisation extends BaseClass
{
	@Test
	public void cteateContact() 
	{
		CRM_LoginPage clog = new CRM_LoginPage(driver);
		clog.giveUsername();
		clog.givePassword();
		clog.clickLogin();
		
		HomePage home = new HomePage(driver);
		home.clickContacts();
		
		
		
		ContactsToOrgPopup con = new ContactsToOrgPopup(driver); 
		Contacts contact = new Contacts(driver);
		contact.getCreateContacts().click();
		utilies.dropDown(contact.getSirnameDropdown(), "Mr.");
		contact.enterdetails("satyam","roy");
		contact.getSelectOrganisation().click();
		utilies.switchTabs(driver);
		con.selectOrg();
		utilies.switchTabs(driver);
		contact.save();
		
		
		ContactsInfo cin = new ContactsInfo(driver);
		String confirmtext = cin.getContactInfoConfirm().getText();
		
		Assert.assertEquals("Contact Information", confirmtext);
		
		
		
	}
}

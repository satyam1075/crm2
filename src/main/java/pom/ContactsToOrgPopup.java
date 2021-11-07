package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsToOrgPopup 
{
	String urls ="http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";

	@FindBy(xpath="//a[text()='kkkkk']")
	private WebElement orgK;
	
	public ContactsToOrgPopup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); 
	}

	public WebElement getOrgK() {
		return orgK;
	}
	
	public String getUrls() {
		return urls;
	}

	public void selectOrg() 
	{
		orgK.click();
	}
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//a[text()=\"Organizations\"]")
	private WebElement organistionBtn;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsBtn;
	
	public WebElement getContactsBtn() {
		return contactsBtn;
	}

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOrganisation() 
	{
		organistionBtn.click();
	}

	public WebElement getOrganistionBtn() {
		return organistionBtn;
	}
	
	public void clickContacts() 
	{
		contactsBtn.click();
	}
}

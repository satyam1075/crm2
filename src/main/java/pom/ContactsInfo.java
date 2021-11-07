package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfo 
{
	@FindBy(xpath="//td[text()='Contact Information']")
	private WebElement contactInfoConfirm;
	
	public ContactsInfo(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactInfoConfirm() {
		return contactInfoConfirm;
	}
}	

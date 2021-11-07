package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationinformationPage 
{
	@FindBy(xpath = "(//a[text()='Organizations'])[2]")
	private WebElement organisationText;

	public OrganisationinformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrganisationText() {
		return organisationText;
	}
	
	
}

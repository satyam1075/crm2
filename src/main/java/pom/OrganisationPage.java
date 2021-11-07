package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganisationBtn;
	
	public OrganisationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganisationBtn() {
		return createOrganisationBtn;
	}
	
	public void clickCreateOrganisation() 
	{
		createOrganisationBtn.click();
	}
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewOrganisation 
{
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationName;
	
	@FindBy(xpath = "//input[@name='email2']")
	private WebElement otherEmail;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDropdown;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement accountTypeDropdown;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement groupRadioBtn;	

	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement marketingGroupDropdown;	
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingDropdown;
	
	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getAccountTypeDropdown() {
		return accountTypeDropdown;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}

	public WebElement getMarketingGroupDropdown() {
		return marketingGroupDropdown;
	}

	public WebElement getRatingDropdown() {
		return ratingDropdown;
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}

	public WebElement getOtherEmail() {
		return otherEmail;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public RegisterNewOrganisation(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void giveValues() 
	{
		organisationName.sendKeys("Reoy EnterPrises 3");
		otherEmail.sendKeys("ross@aborg.com");
		phone.sendKeys("23456789990");
	}
	public void save() 
	{
		saveBtn.click();
	}
}

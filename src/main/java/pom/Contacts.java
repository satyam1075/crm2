package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts 
{
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement createContacts;
	
	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement sirnameDropdown;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement selectOrganisation;	
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveBtn;
	
	
	public Contacts(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreateContacts() {
		return createContacts;
	}


	public WebElement getSirnameDropdown() {
		return sirnameDropdown;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getSelectOrganisation() {
		return selectOrganisation;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void selectTitle() 
	{
		
	}
	
	public void enterdetails(String firstname, String lastname) 
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
	}
	
	public void  save() 
	{
		saveBtn.click();
	}
	
	
	
}

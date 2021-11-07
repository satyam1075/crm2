package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_LoginPage 
{
	@FindBy(xpath="//input[@name=\"user_name\"]")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name=\"user_password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@id=\"submitButton\"]")
	private WebElement  loginbtn;
	
	public CRM_LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void giveUsername() 
	{
		userName.clear();
		userName.sendKeys("admin");
	}
	
	public void givePassword() 
	{
		password.clear();
		password.sendKeys("admin");
	}
	
	public void clickLogin() 
	{
		loginbtn.click();
	}

}

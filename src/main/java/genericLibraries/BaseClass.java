package genericLibraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities utilies= new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//	@BeforeMethod
//	public void openApp() throws Throwable, IOException 
//	{
//		
//		String browse = pdata.getData("browser");
//		
//		if(browse.equalsIgnoreCase("Chrome")) 
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		
//		else if(browse.equalsIgnoreCase("firefox")) 
//		{
//			driver = new FirefoxDriver();
//		}
//		else if(browse.equalsIgnoreCase("IE"))
//		{
//			driver = new InternetExplorerDriver();
//		}
//		
//		driver.manage().window().maximize();
//		driver.get(pdata.getData("url"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
	
	@AfterMethod
	public void closeApp(ITestResult ref) throws IOException 
	{
//		int status = ref.getStatus();
//		String name = ref.getName();
//		
//		if (status == 2)
//		{
//			Photo p = new Photo();
//			p.getPhoto(driver, name);
//		}
		
		driver.quit();
	}
}

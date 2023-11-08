package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.e2e;

public class BaseClass {
	
	public e2e e1;
	public static WebDriver driver;
	
	@BeforeTest
	public WebDriver initiDriver()
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		return driver;
	}
	
	@BeforeClass
	public void objectrepo()
	{
		e1=new e2e(driver);
	}
	
	@AfterTest
	public void closeDriver()
	{
		//driver.close();
	}
}
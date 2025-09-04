package TESTNG_FRAMEWORK.PageFactory1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/*
 * Configuration class 
 */


public class BaseClass {
	
	WebDriver driver ; 
	Page_Locatorclass lp;
	
	@BeforeClass
	public void setup() {
		
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/v1/");
		
	lp = new Page_Locatorclass(driver);
	}
	
	
	
	public void TearDown() throws InterruptedException
	{
		System.out.println(" Quitting the Browser session ");
		
		Thread.sleep(30);
		driver.quit();
	}

}

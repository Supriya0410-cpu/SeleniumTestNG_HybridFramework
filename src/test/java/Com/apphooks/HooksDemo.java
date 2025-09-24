package Com.apphooks;

import org.openqa.selenium.WebDriver;

import Com.utility.BrowserProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksDemo {

	
	public WebDriver driver;
	
	@Before 
	public void setup() throws InterruptedException
	{
		System.out.println("Before will run before every scenario");
		driver=	BrowserProvider.setdriver("edge");
Thread.sleep(30);
		
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After will run After every scenario");
		driver.quit();
		
	}
	
}

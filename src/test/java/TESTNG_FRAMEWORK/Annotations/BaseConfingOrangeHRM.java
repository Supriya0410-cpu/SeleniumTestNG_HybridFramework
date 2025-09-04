package TESTNG_FRAMEWORK.Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfingOrangeHRM {
  
	WebDriver driver;
	
	@BeforeClass
  public void Setup() {
		
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
	
	@BeforeMethod
	public void geturl()
	{
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@AfterMethod
	public void getTittle()
	{
		String Tittle=driver.getTitle();
		System.out.println(Tittle);
	}
	
	@AfterClass
	  public void TearDown() {
			
		driver.quit();
	  }
	
}

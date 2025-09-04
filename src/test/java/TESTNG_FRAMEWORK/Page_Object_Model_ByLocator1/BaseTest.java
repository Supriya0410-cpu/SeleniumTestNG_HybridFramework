package TESTNG_FRAMEWORK.Page_Object_Model_ByLocator1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
  
	WebDriver driver;
	Login_Page lp;
	@Test
  public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		lp=new Login_Page(driver);
		
  }
}

package TESTNG_FRAMEWORK.Page_Object_Model_Bylocator2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TESTNG_FRAMEWORK.Page_Object_Model_ByLocator1.Login_Page;


public class BaseClass {
	  
	WebDriver driver;
	Login_Page1 lp; //this is object of the Login page / page object 
	@Test
  public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
		lp=new Login_Page1(driver);//this is object of the Login page / page object 
		
  }
}
package TESTNG_FRAMEWORK.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMTest extends BaseClass{
	
	
  @Test(priority=1)
  public void testsigninlink() {
	  
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled())
	  {
		  link.click();
	  }
  }
  
  
  @Test(priority=2)
  public void testLogin() 
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-Button")).click();
  
  }
  
  
  @Test(priority=3)
  public void testLogout() 
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
}

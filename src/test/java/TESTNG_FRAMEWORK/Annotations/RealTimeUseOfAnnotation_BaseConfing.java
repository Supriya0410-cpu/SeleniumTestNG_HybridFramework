package TESTNG_FRAMEWORK.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RealTimeUseOfAnnotation_BaseConfing extends BaseConfing{
 
	
@Test(priority=1)
  public void SignIn() {
	
	WebElement ele1=driver.findElement(By.id("SignIn"));
	
if(ele1.isDisplayed()&& ele1.isEnabled())
{
	ele1.click();
}
	
	
  }

@Test(priority=2)
public void Regester()
{
	driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	driver.findElement(By.id("password")).sendKeys("test123");
	
	driver.findElement(By.id("submit-id")).click();
	
	
	
}


}

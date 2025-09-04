package TESTNG_FRAMEWORK.Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRMRealTime extends BaseConfingOrangeHRM {
 
	
	
	@Test(priority=1)
  public void SignIn() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
	@Test(priority=2)
	 public void LogOut() {
		 
		  driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
		  driver.findElement(By.linkText("Logout")).click();
		 
	 }
	 
	 }


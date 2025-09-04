package TESTNG_FRAMEWORK.DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMTestForLogin {
	
  @Test(dataProvider="exceldata",dataProviderClass=CustomeData.class)
  public void testHRM(String un,String psw) throws InterruptedException {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.tagName("button")).click();
	  
	  
	  Thread.sleep(2000);
	  //dashboard page
	  //assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail...");
	  System.out.println("User Login is completed!");
	  
  }
}

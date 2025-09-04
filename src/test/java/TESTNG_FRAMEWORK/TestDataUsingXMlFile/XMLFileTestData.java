package TESTNG_FRAMEWORK.TestDataUsingXMlFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLFileTestData {
 
	
	@Parameters({"EmailId", "Password"})
	@Test
  public void testDataXMLFile(String EmailId ,String Password ) { 
	  
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//locator 
		
		driver.findElement(By.id("input-email")).sendKeys(EmailId);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		System.out.println("Login completed ");
	  
  }
}

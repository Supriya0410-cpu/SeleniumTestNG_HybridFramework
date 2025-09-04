package SpecialScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOM {
  @Test
  public void testshadowDOM() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  

	  
	  driver.get("https://bstackdemo.com/");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  
	  //sign in cliclk
	  
	  driver.findElement(By.id("signin")).click();
	  
	  //enter username 
	  //element not found then find the svg tag 
	 // driver.findElement(By.xpath("//div[text()='Select Username']")).sendKeys(Keys.ENTER);
	  
	  
	  //driver.findElement(By.xpath("(//*[name()='svg'])[2]")).click();
	 // driver.findElement(By.xpath("//div[text()='demouser']")).click();
	  driver.findElement(By.xpath("(//*[name()='svg'])[2]")).click();
	  driver.findElement(By.xpath("//div[text()='demouser']")).click();
	  
	  
	  //password
	  driver.findElement(By.xpath("(//*[name()='svg'])[3]")).click();
	  driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
	  
	  //click on login button
	  driver.findElement(By.id("login-btn")).click();
	  
	  
	  
  }
}

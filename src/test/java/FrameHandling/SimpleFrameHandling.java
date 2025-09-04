package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleFrameHandling {
  @Test
  public void testFrame() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.lambdatest.com/selenium-playground/iframe-demo/");
	  
	  //Switch to frame with index
	  driver.switchTo().frame(0) ;
	  
	  //Switch frame with id/name
	 // driver.switchTo().frame("iFrame1");
	  
	  
	  //switch to frame with webelement
	
     // WebElement frameElement= driver.findElement(By.className("rsw-editor"));
	  //driver.switchTo().frame("frameElement");
	  
	  WebElement ele=driver.findElement(By.className("rsw-ce"));
	  ele.clear();
	  ele.sendKeys("Hello");
	  
	  
  }
}

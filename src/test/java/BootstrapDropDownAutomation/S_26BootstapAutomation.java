package BootstrapDropDownAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S_26BootstapAutomation {
	
	
  @Test
  public void Testing() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	  
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  
	//*[@id="divMain"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]
	  
	  
	  driver.findElement(By.xpath("ui-float-label")).click();
	  
	  
	  
	  
	  
	  
  }
}

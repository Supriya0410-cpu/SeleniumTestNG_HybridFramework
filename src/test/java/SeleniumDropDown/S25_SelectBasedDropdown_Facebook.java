package SeleniumDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Utilities1;

public class S25_SelectBasedDropdown_Facebook {
	
	
	
  @Test
  public void selectdropdownusingutlities()  {
	  
	  
	  //Create webdriver object 
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.facebook.com/");
	  
	  // identify the address of select list  
     driver.findElement(By.linkText("Create new account")).click();
     
     WebElement dele= driver.findElement(By.id("day"));
     Utilities1.Selectdropdown(dele, "14");
     
   WebElement Mele= driver.findElement(By.id("Month"));
	
     Utilities1.Selectdropdown(Mele, "Oct");
     
     
     
     WebElement Yele= driver.findElement(By.id("Month"));
	
     Utilities1.Selectdropdown(Yele, "2011");
     
	
	
	  
	  
	  
  }
}

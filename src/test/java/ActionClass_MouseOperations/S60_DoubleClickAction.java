package ActionClass_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S60_DoubleClickAction {
  @Test
  public void DoubleClickOperation() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  //clcik ele 
	  
	WebElement Dclcilele=  driver.findElement(By.tagName("button"));
	  
	  //for double click use action class
	  
	 Actions act= new Actions(driver);
	 
	 act.doubleClick(Dclcilele).perform();
	 
	 
	 //handle the alert 
	 
	 driver.switchTo().alert().accept();
	  
	  
	  
  }
}

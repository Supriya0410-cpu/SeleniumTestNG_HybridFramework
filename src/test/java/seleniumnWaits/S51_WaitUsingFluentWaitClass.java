package seleniumnWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class  S51_WaitUsingFluentWaitClass {
  @Test
  public void testWait() {
	  
	  //create driver session
	  WebDriver driver = new ChromeDriver();
	  //open URL
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  //click ele
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  
	  //wait
	  
	 FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
		           .pollingEvery(Duration.ofMillis(800)).ignoring(ElementNotInteractableException.class);
	  
By wait1=By.xpath("//h4[text()='Hello World!']");
String text=wait.until(ExpectedConditions.visibilityOfElementLocated(wait1)).getText();
	  
	 
	  
  }
}

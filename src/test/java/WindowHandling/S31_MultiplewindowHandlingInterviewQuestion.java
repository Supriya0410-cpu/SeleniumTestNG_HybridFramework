package WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Utilities1;

public class S31_MultiplewindowHandlingInterviewQuestion {
  @Test
  public void testMultiplewindow() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	 //To retrive Parent id 
	  String parentID=driver.getWindowHandle();
	  
	List<WebElement> allwindow= driver.findElements(By.xpath("//a"));
	  
	  for(WebElement i: allwindow) {
		  
		  i.click();
	  }
	  
	  //get the session id for all windows
	  
	Set <String> allwindowid=  driver.getWindowHandles();
	  // set is unorder now we need order so conver set into a list
	
	List<String> allid= new ArrayList(allwindowid);
	
	
	if(Utilities1.Switchtorightwindow("Youtube", driver, allid))
	{
		System.out.println("url is"+driver.getCurrentUrl());
		System.out.println("url is"+driver.getTitle());
	}
	  
	  
  }
}

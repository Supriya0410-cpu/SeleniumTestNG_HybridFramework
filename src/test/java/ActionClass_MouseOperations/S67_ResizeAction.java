package ActionClass_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S67_ResizeAction {
  @Test
  public void ResizeAction() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://jqueryui.com/resizable/");
	  
	  //here element is in the frame thats why need to switch frame
	  
	  driver.switchTo().frame(0);
	  
	  //find element
	 WebElement ele= driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
	 
	 //action class for sliding 
	 
	 Actions act= new Actions(driver);
	 
	 act.moveToElement(ele).dragAndDropBy(ele, 50,0).build().perform();
	 
	  
	  
  }
}

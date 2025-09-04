package ActionClass_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S63_SliderAction {
  @Test
  public void SliderAction() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://jqueryui.com/slider/");
	  
	  //here is element is under inner frame thats reasen firest need to switch frame 
	  
	  driver.switchTo().frame(0);
	  
	  //find element
	  
	 WebElement ele= driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	 
	 //Actions class use for the slide the elemet
	 //first we need to hold the elethen slider or move ele
	 
	 Actions act = new Actions(driver);
	 act.clickAndHold(ele).moveToElement(ele, 100, 0).build().perform();
	 //here use build bcz of here we need to perform the two actions at atime 
	 
	 
	  
  }
}

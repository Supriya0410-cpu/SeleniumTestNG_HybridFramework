package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ass2 {
  @Test
  public void test() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  driver.switchTo().frame("frame-top");
	System.out.println(driver.getPageSource());
	  
	  //letft frame
	WebElement ele1=driver.findElement(By.xpath("//frame[@src='/frame_left']"));
	driver.switchTo().frame(ele1);
	//driver.switchTo().frame("frame-left");
	System.out.println(driver.getPageSource());
	
	//middleFrame[parent frame method use not deafault content]
	driver.switchTo().parentFrame();
driver.switchTo().frame("frame-middle");
	System.out.println(driver.getPageSource());
	
	//right frame 
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-right");
	System.out.println(driver.getPageSource());
	
	
	//bottom frame 
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame-bottom");
	System.out.println(driver.getPageSource());
	
	
	
	
	
	
	//for bottom frame use deafult content 
	
  }
}

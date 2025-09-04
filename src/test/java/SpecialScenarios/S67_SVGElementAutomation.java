package SpecialScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S67_SVGElementAutomation {
  @Test
  public void testshadowdom() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().window().maximize();
	  
	  //automate links with svg use only xpath name =//*[name()='svg']
	  
 List<WebElement> allsvgle=  driver.findElements(By.xpath("//*[name()='svg']"));
 
 System.out.println("all elements are :"+allsvgle.size());
 
 
 for (WebElement i :allsvgle)
 {
	System.out.println(i.getDomAttribute("href")); 
 }
 
  }
}

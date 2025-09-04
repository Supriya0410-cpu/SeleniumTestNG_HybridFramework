package SeleniumAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S35_AuthenticationPopup {
  @Test
  public void AuthPopup() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  //  driver.get("https://the-internet.herokuapp.com/basic_auth");
	  // Above is actual url but to handle Auth poup we nned to pass arg in the url 
	  //  driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");
	  //Follw above trick to handle this poupup
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String text=driver.findElement(By.id("content")).getText();
	  System.out.println(text);
	
  }
}

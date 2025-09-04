package ActionClass_MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S61_MouseOverAction {
  @Test
  public void NaukariMouseHour() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  driver.get("https://www.naukri.com/");
	  
//find elemet jobs 
	  
	WebElement ele=  driver.findElement(By.xpath("//div[text()='Jobs']"));
	
	//use action class to hour jobs 
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	
	
	//find all list for that first find parent tag then all ele 
	
	List <WebElement> ele2=driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-dropdown')]//ul//li"));
	
	  for(WebElement i:ele2)
	  {
		 System.out.println( i.getText());
	  }
	
	
  }
}

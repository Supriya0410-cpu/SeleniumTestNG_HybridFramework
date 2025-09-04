package ActionClass_MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S59_RightClickAction {
  @Test
  public void RightClickOperation() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  
	WebElement ele=  driver.findElement(By.xpath("//span[text()='right click me']"));
	
	//for Right clcik use action class
	
	Actions act = new Actions(driver);
	
	act.contextClick(ele).perform();// for right clcik use this method & perform is used to perform action 
	//when multiple action is available then use build.perform
	
	//now retrive the all element from the list and click on copy
	
	List <WebElement> allele=driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]//li//span"));
	
	for(WebElement i :allele)
	{
		System.out.println(i.getText());
		if(i.getText().contains("Copy"))
		{
			i.click();
			break;
		}
	}
	
	//handle the alert 
	
	Alert alt=driver.switchTo().alert();
	
	alt.accept();
	
	
	
  }
}

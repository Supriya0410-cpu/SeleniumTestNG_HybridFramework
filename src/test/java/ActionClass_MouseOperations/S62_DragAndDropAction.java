package ActionClass_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S62_DragAndDropAction {
  @Test
  public void DragAndDropAction() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  //switch to the frame 
	  //here element is in under frame thats why we need to seitch frame check while inspecting element where fele
	  //is inner frame 
	  driver.switchTo().frame(0);
	  
	  //find the element address
	  
	WebElement srcle=  driver.findElement(By.id("draggable"));
	  
	WebElement tarele=  driver.findElement(By.id("droppable"));
	
	
	//create action class for the drag and drop 
	
	Actions act = new Actions(driver);
	act.dragAndDrop(srcle, tarele).perform();
	
	  
  }
}

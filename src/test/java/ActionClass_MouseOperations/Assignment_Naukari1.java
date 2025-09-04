package ActionClass_MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_Naukari1 {
  @Test
  public void naukari() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	  
	  driver.get("https://www.naukri.com/");
	  
	  // find the ele x path 
	  
WebElement ele=	  driver.findElement(By.xpath("//div[text()='Companies']"));
	  
	  
	  //use action class to hour mouse 
Actions act= new Actions(driver);

act.moveToElement(ele).perform();

//to get all list first find paraent element then all ele 
	  
	List<WebElement> allele= driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-dropdown')]//ul//li//a"));
	
	
	for(WebElement i :allele)
	{
		System.out.println(i.getText());
	}
	
	
	
	
	
	
	
	
  }
}

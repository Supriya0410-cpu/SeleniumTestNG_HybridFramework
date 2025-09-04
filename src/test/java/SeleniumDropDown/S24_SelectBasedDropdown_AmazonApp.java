package SeleniumDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class S24_SelectBasedDropdown_AmazonApp {
  @Test
  public void selectdropdown() throws InterruptedException {
	  
	  //Create webdriver object 
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.amazon.in/");
	  
	  // identify the address of select list  
	  
	WebElement ele= driver.findElement(By.id("searchDropdownBox"));
	  
	//create object for Select class pass the object of list ele
	
	Select d1= new Select(ele);
	
	System.out.println(" check whetehr the lis able to select multiple element : "+d1.isMultiple());
	
	
	// select the single option
	
       d1.selectByIndex(2);
	
	Thread.sleep(200);
	
	
	//select the list option using visible text 
	
	d1.selectByVisibleText("Appliances");
	
	Thread.sleep(200);
	  
	
	// select by the value attribute 
	
	d1.selectByValue("search-alias=apparel");
	
	// to retrive all list 
	
	List <WebElement> ele2=d1.getOptions();
	System.out.println("all list count :"+ ele2.size());
	
	for(WebElement i:ele2)
	{
	 System.out.println(i.getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}

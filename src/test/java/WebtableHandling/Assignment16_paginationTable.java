package WebtableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment16_paginationTable {
  @Test
  public void Page4CheckboxAutmate() {
	  
	  
	  
  WebDriver driver =new ChromeDriver();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println("************************Total pages avaibale****************************");
	  
	List <WebElement> allpages= driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println(allpages.size());
	  
	  
	  System.out.println("***************Automate clcik all checkbox of page 4*********************");
	  
	  
	  for(WebElement i:allpages)
	  {
		  
		  if(i.getText().contains("4"))
		  {
			  i.click();//4th page will open 
			  
			  //find x path for all check box for that we need check box col 
	List<WebElement> allcheckbox=	driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[4]"));
	
			for(WebElement j:allcheckbox)
			{
				j.click();
				
			}
			 
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

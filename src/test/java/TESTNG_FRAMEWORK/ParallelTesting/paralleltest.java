package TESTNG_FRAMEWORK.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class paralleltest {
  @Test(priority=1)
  public void testParallelChrome() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing");
	  	
  }
  
  @Test(priority=2)
  public void testparalleledge()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.id("APjFqb")).sendKeys("cypress Testing");
  }
}

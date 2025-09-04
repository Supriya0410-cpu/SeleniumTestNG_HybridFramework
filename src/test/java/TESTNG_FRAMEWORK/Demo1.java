package TESTNG_FRAMEWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	
  @Test(priority=3)
  public void testpriorityannotations() {
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	 }
 
  
  @Test(priority=2)
public void testpriorityannotations1() {
	  
	  WebDriver driver= new EdgeDriver();
	  driver.get("https://www.google.com/");
	  
	 }

@Test(priority=1)
public void testpriorityannotations2() {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  
	 }
}










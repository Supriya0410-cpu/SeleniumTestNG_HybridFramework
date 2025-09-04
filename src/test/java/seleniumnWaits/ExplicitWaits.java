package seleniumnWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Utilities1;

public class ExplicitWaits {
  @Test
  public void test() {
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  
	  //By locators(address)
	  By email=By.id("input-email");
	  By Pass=By.id("input-password");
	  By SubBtn=By.xpath("//input[@value='Login']");
	  
	  
	  
	  Utilities1.WebDriverWaitVisisblityOfElement(driver, email).sendKeys("abc123@gmail.com");
	  Utilities1.WebDriverWaitPresenceofElemet(driver, Pass).sendKeys("23456");
	  Utilities1.WebDriverWaitelementtoclickable(driver, SubBtn).click();
	 
	  
	  Utilities1.WebDriverWaitURLContains(driver);
	  
	  Utilities1.WebDriverWaitpagetittlecontains(driver);
	  
	  
	  
	  
	  
	  
	/*  //element 1
	  WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(6));
	 WebElement emailEle=wait1.until(ExpectedConditions.visibilityOfElementLocated(email));
	 
	emailEle.sendKeys("test34@gmail.com"); 
	 
	 //element 2
	 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailEle2= wait2.until(ExpectedConditions.presenceOfElementLocated(Pass));
	 emailEle2.sendKeys("23456");
	 
	 
	 //element 3
	 
	 WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailEle3=wait3.until(ExpectedConditions.elementToBeClickable(SubBtn));
	 emailEle3.click();
	 
	 */
	 
	 
  }
}

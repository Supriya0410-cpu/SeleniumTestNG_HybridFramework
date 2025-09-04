package SeleniumDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Utilities1;
/*
 * Write Automation script to fill the form
https://register.rediff.com/register/register.php?FormName=user_details
automate input boxes,checkboxes,dropdown
 * 
 */
public class Assignment07SelectDropdown {
  @Test
  public void dropdown() {
	  
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("supriya sul");
	  
	  driver.findElement(By.xpath("//input[@name='login2dda6660']")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("@@fghffd");
	 
	  
	  // identify the address of select list  
	  
	//WebElement ele1= driver.findElement(By.className("day"));
	 //  Utilities1.Selectdropdown(ele1, "05");
	  
	  WebElement ele2=  driver.findElement(By.xpath("(//div[@class='form-group'])[5]//select[2]"));
		   Utilities1.Selectdropdown(ele2, "OCT");
		  
		   
		//	WebElement ele3= driver.findElement(By.className("year"));
		//	   Utilities1.Selectdropdown(ele3, "2000");
			  
	  
  }
}

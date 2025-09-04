package SeleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S32_AlertDemo1 {
	@Test
	public void SimpleAlertDemo() throws InterruptedException {



		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Enter the username

		driver.findElement(By.id("login1")).sendKeys("test");

		//enter the password

		driver.findElement(By.name("proceed")).click();
 
		 Thread.sleep(1500);
		//handle the alert need to switch on that popup

		Alert l1=	driver.switchTo().alert();
		
		//to click on that ok button 
		
		l1.accept();
		
		  //password
		 driver.findElement(By.id("password")).sendKeys("test123");

	}
}

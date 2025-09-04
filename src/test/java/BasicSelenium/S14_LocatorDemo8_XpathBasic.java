package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S14_LocatorDemo8_XpathBasic {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Basic Xpath
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		
		String exp_URL="https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if(driver.getCurrentUrl().contains(exp_URL))
		{
			System.out.println("Url validation sucessfull");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

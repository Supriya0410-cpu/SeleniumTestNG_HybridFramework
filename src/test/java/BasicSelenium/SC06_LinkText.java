package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC06_LinkText {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();

		driver.get("https://automationplayground.com/crm/");

		// Validate LINK-TEXT OR HYPER-LINK 

		//driver.findElement(By.linkText("Sign In")).click();// full text compare  

		//or
		driver.findElement(By.partialLinkText("Sign")).click();//If enter text present in that element it will continue execution
	}

}

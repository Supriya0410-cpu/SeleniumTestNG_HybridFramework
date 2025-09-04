package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
  Automate login and logout for swaglab application using only cssSelectorAdd commentMore actions
validate title and Url 
 * 
 */
public class AssignmentNo4 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.btn_action")).click();		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//Validate URL 
		
		String Actual_Url="https://www.saucedemo.com/v1/inventory.html/";
		
		if(Actual_Url.equals(driver.getCurrentUrl()));
		{
			System.out.println("Url equals");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     //Validate Tittle
		
		String tittle =driver.getTitle();
		
		if(tittle.contains("saucedemo"))
		{
			
			System.out.println("validated url is correct");
		}
		
		
		
		
		
		
	}

}

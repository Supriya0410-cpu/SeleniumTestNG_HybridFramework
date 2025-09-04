package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Retrive th footer list-- https://www.freshworks.com/
 *
 */
public class S19_FooterLinksAutomationFreshworks {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshworks.com/");
	// for single list 	
	List<WebElement> ele=	driver.findElements(By.xpath("(//ul[contains(@class,'dRHBZS')])[1]//li"));
		
		for(WebElement i:ele)
		{
			System.out.println(i.getText());
		}
		
		
		// for multiple list 
		
		
		
		
		List<WebElement> ele2=	driver.findElements(By.xpath("//ul[contains(@class,'dRHBZS')]//li"));
		for(WebElement i:ele2)
		{
			i.getText();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	

}

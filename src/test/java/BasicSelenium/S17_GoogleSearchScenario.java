package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 
 * Open Google app search for the cypress and captur all the suggested list and print in console 
 * 
 * 
 */
public class S17_GoogleSearchScenario {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Cypress");
		
		List<WebElement> ele= driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		
		for(WebElement i:ele)
		{
			
			System.out.println("all suggessted element are:"+i.getText());
		}
		
		
		
	}

}

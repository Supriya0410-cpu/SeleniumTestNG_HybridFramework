package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_LocatorDemo4_CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://automationplayground.com/crm/");
		
		driver.manage().timeouts().getImplicitWaitTimeout().ofSeconds(200);
		
		//Element using A Tag name with id value
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		//Element using A Tag name with attribute name and value 
		
		driver.findElement(By.cssSelector("input[name=\"email-name\"]")).sendKeys("test@1234");
		
		//Element using A Tag name with id  
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		//Element using A Tag name with classname
		
		//driver.findElement(By.cssSelector("button.btn-primary")).click();
		
		//for class name identify the unique class name check each class name seperalty 
		
		
	//Mix with class name and attribute value 

		driver.findElement(By.cssSelector("button.btn-primary[type=\"submit\"]")).click();
	}

}

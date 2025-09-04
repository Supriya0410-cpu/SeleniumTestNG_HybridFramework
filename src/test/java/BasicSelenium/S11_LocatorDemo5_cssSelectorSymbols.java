package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_LocatorDemo5_cssSelectorSymbols {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//searchbox:tagname with $(endswith)

		driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("bags",Keys.ENTER);


		//clear the text and search for mobiles: tagname with ^(startswith)

		WebElement res=	driver.findElement(By.cssSelector("input[id^='two']"));

		//for clear we need to store in varibale after that use the clear method 
		
		res.clear();
		res.sendKeys("Mobiles",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

		
		//clear the text and search for watch: tagname with *(contains partial match)
		
		
		WebElement res1= driver.findElement(By.cssSelector("input[id*='search']"));
		
		res1.clear();
		res1.sendKeys("watch",Keys.ENTER);
		
		
	}
	
	

}

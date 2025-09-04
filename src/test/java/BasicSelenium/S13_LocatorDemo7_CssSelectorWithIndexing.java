package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S13_LocatorDemo7_CssSelectorWithIndexing {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	String list=	driver.findElement(By.cssSelector("div.list-group>a:nth-child(3)")).getText();
	System.out.println(list);
	
	
		
	
		

	}

}

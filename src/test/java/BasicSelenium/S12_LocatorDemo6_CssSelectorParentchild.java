package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_LocatorDemo6_CssSelectorParentchild {

	public static void main(String[] args) {
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	List<WebElement> list=	driver.findElements(By.cssSelector("ul.dRHBZS>li>a>span"));
		
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}

	}

}

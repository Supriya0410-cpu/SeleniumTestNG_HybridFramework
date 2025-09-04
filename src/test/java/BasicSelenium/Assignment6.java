package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");
		// for multiple list 

		List<WebElement> ele=	driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol')]//ul//li"));

		for(WebElement i:ele)
		{
			System.out.println(i.getText());
		}

	}

}

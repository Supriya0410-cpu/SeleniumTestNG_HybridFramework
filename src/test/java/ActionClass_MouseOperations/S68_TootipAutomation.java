package ActionClass_MouseOperations;
import java.time.Duration;

import org.openqa.selenium.By;
/*'
 * Tool tip means once you hour pointer on any element and after that you will see any text 
 * and that text you want to get 
 * for that we need to stop dom in debug mode 
 * for pause use f8 or cntrl+/
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S68_TootipAutomation {
	@Test
	public void TootipAutomation () {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/tooltip/");

		driver.manage().window().maximize();
		//frame switch
		driver.switchTo().frame(0);
// scroll down 
		//element
		WebElement ele=driver.findElement(By.id("age"));


		//mouse actions 
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();


		//To get Text on Debug mode (cntrl+/)or f8
		//div[contains(@class,'ui-tooltip-content')]

	String tooltip=	driver.findElement(By.xpath("//div[contains(@class,'ui-tooltip-content')]")).getText();
System.out.println(tooltip);

	}
}

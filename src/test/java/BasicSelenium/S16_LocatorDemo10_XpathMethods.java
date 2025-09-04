package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S16_LocatorDemo10_XpathMethods {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//fashion:xpath with text()
		driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		//cart message : xpath with normalize-space()
		
	//	driver.findElement(By.xpath("//div[@id='nav-cart-text-container']/span/span")).click();
		
		//cart message : xpath with normalize-space()
	String msg=	driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		
	System.out.println(msg);
	
	//search box:watch: xpath with contains()
	
	driver.findElement(By.xpath("//input[contains(@id,'two')]")).sendKeys("watch",Keys.ENTER);
	
	
	//get the any keyword result text
	
	String rs=driver.findElement(By.xpath("//div[contains(@class,'sg-col-inner')]")).getText();
		
		System.out.println(rs);
		
		//clear the result->search for Bags
		
	WebElement ele=	driver.findElement(By.xpath("//input[contains(@id,'two')]"));
		
		ele.clear();
		ele.sendKeys("mobile");
		
		
		
		
	}

}

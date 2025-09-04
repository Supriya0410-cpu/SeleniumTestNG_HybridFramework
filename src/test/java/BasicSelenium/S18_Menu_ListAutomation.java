package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S18_Menu_ListAutomation {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//All element list
	List<WebElement> ele=	driver.findElements(By.xpath("//div[@class='list-group']//a"));
		
		
		for(WebElement i:ele)
		{
			System.out.println("all elements are:"+i.getText());
		}
		
		
		// for single element and click on that element 
		
	driver.findElement(By.xpath("(//div[@class='list-group']//a)[3]")).click();
		
		
		

	//All element list and when  you go specfic ele then stop and clik that ele 
List<WebElement> ele3=	driver.findElements(By.xpath("//div[@class='list-group']//a"));
	
String 	exptext="Address Book";
	for(WebElement i:ele3)
	{
		System.out.println("all elements are:"+i.getText());
		if(i.getText().contains(exptext)) 
		{
			
			i.click();
			break;
		}
	}
	

	}

}

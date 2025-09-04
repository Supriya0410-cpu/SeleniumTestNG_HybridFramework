package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC08_Locator_TagName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println("************************************TAG IMG**********************************************");	
		List<WebElement> images=driver.findElements(By.tagName("img"));

		//list method 
		System.out.println("Total images are:"+images.size());

		for(WebElement i:images)
		{
			//to get the dom attributes and get text from that attributes 
			System.out.println("images in dom sturture:"+i.getDomAttribute("src"));
			System.out.println("Image text is :"+i.getText());
			
	/*	
	 String	Actaulimg="https://opensource-demo.orangehrmlive.com/web/images/ohrm_branding.png?v=1721393199309";
			
			if(i.getDomAttribute("Actaulimg").contains("images"))
			{
				System.out.println("Dom atribute contains a images");
			}
		*/
			
			
		}

	
		
		
		
		
		System.out.println("************************************Tag Link*********************************************");

		List<WebElement> link =driver.findElements(By.tagName("a"));
		System.out.println("total link are:"+link.size());

		for(WebElement i:link) {

			System.out.println("Link  in the DOM :"+i.getDomAttribute("href"));
			System.out.println("Text in link:"+i.getText());
		}


System.out.println("*************************Tag INPUT************************************************");

 List<WebElement> input= driver.findElements(By.tagName("Input"));
 
 System.out.println("Total input tags are:"+input.size());
 
 for(WebElement i:input)
 {
	 System.out.println("Dom attributes are"+i.getDomAttribute("class"));
	 System.out.println("Text is :"+i.getText());
 }
 
 
 System.out.println("************Wrong tag name entered*************");
 

	List<WebElement> link1 =driver.findElements(By.tagName("a**GGF##"));
	System.out.println("total link are:"+link1.size());

	for(WebElement i:link1) {

		System.out.println("Link  in the DOM :"+i.getDomAttribute("href"));
		System.out.println("Text in link:"+i.getText());
	}
 
 






	}

}

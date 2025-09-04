package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNO_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch");
		
		
	List<WebElement> links=driver.findElements(By.tagName("link"));
	System.out.println("Total Links are:"+links.size());
	
	
	for(WebElement i:links)
	{
		System.out.println("links are:"+i.getDomAttribute("href"));
		System.out.println("Link Text is a :"+i.getText());
	}
		
	}

}

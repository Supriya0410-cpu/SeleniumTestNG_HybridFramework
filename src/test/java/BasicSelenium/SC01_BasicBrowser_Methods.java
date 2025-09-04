package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC01_BasicBrowser_Methods {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		//To open the application 
		driver.get("https://www.google.com/");
		
		//To get the tittle of url 
		System.out.println("Page tittle is :-"+driver.getTitle());
		
		//Get Current URL
		System.out.println("Page URL is:"+driver.getCurrentUrl());
		
		//get page souce code 
	//System.out.println("page source code is :"+driver.getPageSource());
		
		
		
		
		//close the page
		driver.quit();
		
		
		
		

	}

}

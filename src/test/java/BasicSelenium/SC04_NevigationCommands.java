package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC04_NevigationCommands {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//Nevigation commands
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		driver.quit();
		
		
		
		
		
		
		

	}

}

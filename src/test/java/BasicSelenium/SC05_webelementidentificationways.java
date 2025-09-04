package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC05_webelementidentificationways {

	public static void main(String[] args) {
		//initilize browser
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//Technique 1: By locator (used in Framework )
		
	By actualele =By.id("APjFqb");
	
	//identify elemet by using findelement method 
	
	WebElement searchbox=driver.findElement(actualele);
	
//Validate Seach box displayed or not 
	
  System.out.println(searchbox.isDisplayed());// return boolean value (True/False)
System.out.println(searchbox.isEnabled());//return boolean value (True/False)
	
//Technique2: Identify+validate+perform action
		
		WebElement searchelement= driver.findElement(By.id("APjFqb"));
		
		if(searchelement.isDisplayed() && searchelement.isEnabled()) {
			
			System.out.println("Validation Correct");
		}
		
		else
		{
			System.out.println("Validation false");
		}
		
		
		//Technique3:Find element and perform action
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
	}
	
	
	

}

package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S30_MultipleWindowHandling {
	@Test
	public void WindowHandling() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//To get paraent id of parent window 

		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		
		
		//click on the  link for go to next page
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
	Set<String> allwindows= driver.getWindowHandles();
	
	System.out.println(allwindows);
		
		
	// iterate the child window open 
	
	
	for(String childid:allwindows) {
		
		
		if(!parentID.equals(childid))
		{
			driver.switchTo().window(childid);
			driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("test@gmail.com");
			
			driver.findElement(By.name("action_request")).click();
			
		}
	}
	
     driver.switchTo().window(parentID);
     driver.findElement(By.name("username")).sendKeys("Admin");
	}
}

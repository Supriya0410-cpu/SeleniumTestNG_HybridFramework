package SeleniumAlerts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentListofAlert {
  @Test
  public void AlertList() throws InterruptedException {
	  
	  
	  
	  WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	List <WebElement> ls =driver.findElements(By.xpath("//ul//li"));
	
	System.out.println(ls);
	String ACTTEXT="Click for JS Alert";
	String ACTText2="Click for JS Confirm";
	String ACTText3="Click for JS Prompt";
	
	WebElement res=	driver.findElement(By.id("result"));
	
	for(WebElement i :ls) {
		
		System.out.println("All list elements are "+i.getText());
		
		if(i.getText().contains(ACTTEXT))
		{
			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			Thread.sleep(1500);

			Alert l1=  driver.switchTo().alert();
			l1.accept();

			// To retrive the Result text is

		//	WebElement res=	driver.findElement(By.id("result"));
			System.out.println(res.getText());
		}
		
		if(i.getText().contains(ACTText2))
		{

			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			Thread.sleep(1500);
			Alert l2= driver.switchTo().alert();
			//Cancle button click
			l2.dismiss();

			// To retrive the Result text is res obj already create use that one 
			System.out.println(res.getText());

		}
		
		if(i.getText().contains(ACTText3))
		{

			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

			Thread.sleep(1500);
			Alert l3=driver.switchTo().alert();
			
			l3.sendKeys("welcome");
			l3.accept();
			

			// To retrive the Result text is res obj already create use that one 
			System.out.println(res.getText());

		}
		else
		{
			System.out.println("OOPPS....out of 3 option not matched with your requriment");
		}
	}
	

  }
}

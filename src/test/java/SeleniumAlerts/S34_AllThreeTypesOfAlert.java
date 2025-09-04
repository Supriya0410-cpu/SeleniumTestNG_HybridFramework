package SeleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S34_AllThreeTypesOfAlert {
	@Test
	public void allalertTest() throws InterruptedException {



		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Alert1-Handle simple alert 

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1500);
		//Switch to the alert window

		Alert l1=  driver.switchTo().alert();
		//to retrive text of that alert button

		System.out.println("Alert text is :"+l1.getText());

		l1.accept();

		// To retrive the Result text is

		WebElement res=	driver.findElement(By.id("result"));
		System.out.println(res.getText());

		// Alert2-Confirmation Alert

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(1500);
		Alert l2= driver.switchTo().alert();

		//to retrive text of that alert button
		System.out.println(" alert text is "+l2.getText());

		//Handle alert 
		// for ok button accept 
		//l2.accept();

		//for cancle buttion dissmis

		l2.dismiss();

		// To retrive the Result text is res obj already create use that one 
		System.out.println(res.getText());

		//alert3: Prompt alert

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Thread.sleep(1500);
		Alert l3=driver.switchTo().alert();
		//to retrive text of that alert button
		System.out.println(" alert text is "+l2.getText());


		//handle alert 
		l3.sendKeys("welcome");
		l3.accept();
		

		// To retrive the Result text is res obj already create use that one 
		System.out.println(res.getText());

	}



}

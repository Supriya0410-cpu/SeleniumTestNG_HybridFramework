package DatePicker;
/*For date picker understand the steps and this code resusable for all date picker cal 
 * just you need to change your xpath this code ts ststic for all
 * 1.create driver session ...waits..URL...Maximize
 * 2.write your exptation clearly 
 * 3. use while(true) and for get current month find the xpath and split into 2 part then compare it to expetation using i f
 * 4.then else click arrow
 * 5.date fin xath of all dates and including day as well and use for loop
 * 6. then use if condtion for expdate and break use 
 */
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
  @Test
  public void Datepickergoibo() {
	  
	  
	  //Create A driver session
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //open browser
	  driver.get("https://www.goibibo.com/flights/");
	  
	  //maximize browser
	  
	  driver.manage().window().maximize();
	  
	  
	  //Click on close button 
	  
	  driver.findElement(By.xpath("//span[contains(@class,'sc-koXPp')]")).click();	  
	  
	  
	 //Alert l1= driver.switchTo().alert();
	//  l1.accept();
	  
	  
	  //Click on the Arrow of date 
	  
	  driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();	  
	  
	  //expectation
	  String expDate="4";
	  String expMonth="October";
	  String expYear="2025";
	  
	 //Moth selection 
	  
	  while(true)
	  {
		  //get current month 
		  
		String ele=  driver.findElement(By.xpath("(//div[contains(@class,'DayPicker-Caption')])[1]")).getText();
	
		String Current_Month=ele.split(" ")[0];
		String Current_Year=ele.split(" ")[1];
		
		if(Current_Month.contains(expMonth) && Current_Year.contains(expYear))
		{
			System.out.println("Your exp month found");
			break;
		}
		  
		else 
		//Click on Arrow 	
		{
			driver.findElement(By.xpath("(//span[contains(@class,'DayPicker-NavButton')])[2]")).click();
		}
	  }
	  
	  
	  //Date picker here go to parent element and then individual day 
	  
	  List <WebElement> alldate=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
	  
	  for(WebElement date:alldate)
	  {
		  
		  if(date.getText().contains(expDate))
		  {
			  date.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

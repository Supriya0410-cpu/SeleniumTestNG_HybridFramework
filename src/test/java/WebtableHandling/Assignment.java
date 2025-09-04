package WebtableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment  {
  @Test
  public void f() {
	  
	  

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		  System.out.println("***********Headings*************");
		  
		  
			List<WebElement> ele1=  driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr//th"));
			  
			for(WebElement i:ele1)
			{
			System.out.println(i.getText());
			}
			  
		
		 System.out.println("**********Specific row************");	
			
		
		int row=0;//for row count
		int cell=0;//for name cell count
		String name="Name";
		String Brname="Firefox";

		for(WebElement i:ele1)
		{
			cell++;
			
			if(i.getText().contains(name))
			{
				System.out.println("Whole table cell number is :"+cell);
				
				
			List<WebElement>allcelldata=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cell+"]"));
				
			
			 for(WebElement cdata :allcelldata) {
				
				 row++;
				 
				 if(cdata.getText().contains(Brname))
				 {
					 System.out.println(Brname+" Expected browser ans row count is :"+row);
					
					 
					List<WebElement> all= driver.findElements(By.xpath("//table[@id='taskTable']//tr["+row+"]//td"));
					
					 for(WebElement data:all)
					 {
						 System.out.println(data.getText());
					 }
					 
				 }
				 
			 }
			
				
				
			}
			
			
			
		}
		
		
		
		//div//p[3]//strong[@class='chrome-network']
		
		
		
		
		
		

  }
}

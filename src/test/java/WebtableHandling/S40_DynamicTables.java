package WebtableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S40_DynamicTables {
  @Test
  public void DynamicTbale() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("***********Headings*************");
	  
	  
	List<WebElement> ele1=  driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr//th"));
	  
	for(WebElement i:ele1)
	{
	System.out.println(i.getText());
	}
	  
	  
	 System.out.println("**********Total Rows***********");
	
	int ele2=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr")).size();
	 System.out.println("total rowa are :"+ele2);
	 
	 System.out.println("*******Total Columns***********");
	

		int ele3=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr[2]//td")).size();
		 System.out.println("total rowa are :"+ele3);
	
	
	
		 System.out.println("**********Specific Column************");
	
	 int cellCount=0;
			String expCell="CPU (%)";
			for(WebElement i:ele1)
			{
			cellCount++;
				if(i.getText().contains(expCell))
				{
					System.out.println(expCell+" matched at column number: "+cellCount);
					List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellCount+"]"));
					for(WebElement j:cellData)
					{
						System.out.println(j.getText());
					}
					
				}
			}
		 
		 
			
			
			 System.out.println("**********Specific row************");	
			
			 //first check your table then choose what things you need to do step by step to reach your data 
			
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
					//here we got the headings 
					//Now we want data for name colum we neeed that data for display row
					
					//driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
					//here now we neeed to chnage theindex number for dynamic logic we give our varibale name 
				List<WebElement>allcelldata=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cell+"]"));
					//Now compare your cell data with br name 
				
				 for(WebElement cdata :allcelldata) {
					 //here actual row start 
					 row++;
					 
					 if(cdata.getText().contains(Brname))
					 {
						 System.out.println(Brname+" Expected browser ans row count is :"+row);
						 //for specic row data //table[@id='taskTable']//tr[3]//td [here change the index 3 as per our row 
						 
						List<WebElement> all= driver.findElements(By.xpath("//table[@id='taskTable']//tr["+row+"]//td"));
						 //to print data iterate 
						 for(WebElement data:all)
						 {
							 System.out.println(data.getText());
						 }
						 
					 }
					 
				 }
				
					
					
				}
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
	
	
	
  }
}

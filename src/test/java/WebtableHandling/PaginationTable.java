package WebtableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationTable {
  @Test
  public void PaginationAutomation() {
	  
	  WebDriver driver =new ChromeDriver();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println("************************Total pages avaibale****************************");
	  
	List <WebElement> allpages= driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println(allpages.size());
	  
	  System.out.println("*************Total rows as per pages*******************");
	  //for total row first we need to click the pages or traversal the pages 
	  //we have alrady found the count 
	  //now iterate the all pages to clik pirticuar page 
	  
	  //pgno for the current page count 
	  
	  int pgno=0;
	  int totalrows=0;
	  for(WebElement i:allpages )
	  {
		  i.click();// page will open 
		  pgno++;
		  
		  System.out.println("Current page no is "+pgno);
		  
		  //here now we need to go find the total row 
		  
		int row=  driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  
		  //here now we need to go find the total coloumn 
		  

		 // int col= driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		  
		  System.out.println("Number of rows are"+row);
		  
		 // System.out.println("Number of col are"+col);
		  
		  totalrows=totalrows+row;
		  
		System.out.println("Tota rows are"+totalrows); 
	  }
	  
	  
	  System.out.println("****************Every page no of product****************************");
	  
	  //fr this we need the all pages which we alreay cover all pages and we need to click as well 
	  //and exact xpath of product coloumn 
	  
	int  pgno1=0;
	  for(WebElement i:allpages )
	  {
		  i.click();// page will open 
		  
		  pgno1++;
		   
			System.out.println("current page no is :"+pgno1);
		  //for coloum product actual xpath 
		  
		List<WebElement> colproductlist= driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));

		//Here for all list we need again traversing to the whole table 
		for (WebElement j:colproductlist)  
		{
			System.out.println(j.getText());
		}
		
	  }
		  
		  System.out.println("*********Select any one option from table***********");
		  
		
		  for(WebElement i:allpages )
		  {
		  
			  if(i.getText().contains("3"))
			  {
				  i.click();
				  
			String ele=	  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[3]//td[2]")).getText();
				
			System.out.println(ele);
			  }
		  
		  }
		  
		  
		  
		  
		  
		  
	
	  
	  
  }
}

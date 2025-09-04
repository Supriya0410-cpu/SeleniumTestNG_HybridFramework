package SpecialScenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.ClassFileLocator.ForUrl;

public class S69_BrokenLink {
  @Test
  public void test_Broken_Link() throws IOException {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
	  
	  //find total link using a tag 
	  
	List <WebElement> allele= driver.findElements(By.tagName("a"));
	
	System.out.println("all link size:"+allele.size());
	  
	//get all link 
	
	for(WebElement i: allele)
	{
		  //1.link should have href attribute and it should not be empty or null
	String allhref=	i.getDomAttribute("href");
	
	if(allhref.isEmpty() || allhref==null)
	{
		
		 System.out.println("Empty or Null link we cant automate");
		  System.out.println(allhref);
		  continue;//skip
	}	
	}
	
	//all reaming links are valid so pass to the server 
	
	try {
		URL url = new URL("allhref");
		
		//To establish connection to server open server connection
		
//URLConnection httpurl=url.openConnection();

		 HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
//connect to the server
httpurl.connect();
int statusCode=httpurl.getResponseCode();	


int brokenLinkCount=0;
int validLinkCount=0;
if(statusCode>=400)
{
	 brokenLinkCount++;
	  System.out.println("===========Broken Link=================");
	 
}else
{
	  validLinkCount++;
	  System.out.println("================Valid Link================");
}






		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
  }
}

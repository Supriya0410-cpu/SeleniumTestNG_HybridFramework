package Com.RemoteExcecution;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRemotelyChrome {
	@Test
	  public void testGoogleApp() throws MalformedURLException, URISyntaxException, InterruptedException 
	  {
		  //to open chrome on server use capability
		 ChromeOptions bname=new ChromeOptions();
		 // FirefoxOptions bname=new FirefoxOptions();
		  
		  
		  //set the server address: Deprecated.  Use URI.toURL() to construct an instance of URL. 
		  URL serverurl=new URI("http://localhost:4444/").toURL();
		  
		   
		  //to create remote execution server url and browser
		  WebDriver driver=new RemoteWebDriver(serverurl,bname);
		  
		  System.out.println("Remote connection is completed......");
		  
		  Thread.sleep(5000);
		  
		  driver.get("https://www.google.com");
		  
		  Thread.sleep(10000);
		  
		  System.out.println("Title is: "+driver.getTitle());
		  
		  driver.quit();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  }
}

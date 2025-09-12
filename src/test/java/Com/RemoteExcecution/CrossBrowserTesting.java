package Com.RemoteExcecution;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  @Test
  @Parameters({"bname"})
  public void crossBrowser(String bname) throws MalformedURLException, URISyntaxException, InterruptedException {
	  
	  WebDriver driver = null;
	  
  URL serverUrl=new URI("http://localhost:4444/").toURL();
	  
	  if(bname.equals("chrome"))
	  {
		  ChromeOptions name=new ChromeOptions();
		  driver=new RemoteWebDriver(serverUrl,name);
		  
	  }else if(bname.equals("edge"))
	  {
		  
		EdgeOptions name=new EdgeOptions();
		  driver=new RemoteWebDriver(serverUrl,name);
		  
	  }else if(bname.equals("firefox"))
	  {
		  FirefoxOptions name=new FirefoxOptions();
		  driver=new RemoteWebDriver(serverUrl,name);
	  }
	  
	  
	  Thread.sleep(10000);
	  //open app
	  driver.get("https://automationplayground.com/crm/");
	  
	  Thread.sleep(8000);
	  
	  driver.findElement(By.linkText("Sign In")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
  }
}

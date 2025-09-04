package Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class S52_GetAppCapabilitiesforBrowser {
  @Test
  public void testallbrowser() {
	  
	  
	  //chrome 
	  ChromeDriver driver1= new ChromeDriver();
	  Capabilities cap1= driver1.getCapabilities();
	Map <String , Object> allcap1=  cap1.asMap();
	
	System.out.println(allcap1);
	
	//edge
	/*EdgeDriver driver2 = new EdgeDriver();
	 Capabilities cap2=driver2.getCapabilities();
	 
	 Map <String , Object> allcap2= cap2.asMap();
	 
	 System.out.println(allcap2);
	
	
	*/
	
  }
}

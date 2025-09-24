package Com.utility;

/*ThreadLocal class used to use common driver for all pkg or classes 
 * 
 * 
 * 
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserProvider {
	
	
	
	public static  WebDriver driver;
	
	static ThreadLocal<WebDriver> tdriver= new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getdriver() {
		
		return tdriver.get();
	}
	
	
public static WebDriver  setdriver(String bname)
{
	
	if(bname.equals("chrome"))
	{
		driver=new ChromeDriver();
		tdriver.set(driver);
	}
	else if(bname.equals("edge"))
	{
		driver=new EdgeDriver();
		tdriver.set(driver);
	}
	
	
	return getdriver();
	
	
	}


}

package TESTNG_FRAMEWORK.Annotations;
import java.time.Duration;

/*
 * Base class used for the configruation related things 
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfing {
	
	 WebDriver driver;
	
	
  @BeforeClass
  public void setup() {
	  
	  driver= new ChromeDriver();
	  
	  driver.get("https://automationplayground.com/crm/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  
  @BeforeMethod
  public void geturl()
  {
	 String URL= driver.getCurrentUrl();
	 System.out.println(URL);
  }
  
  @AfterMethod
  public void getTittle()
  {
	  String Tittle=driver.getTitle();
	  System.out.println(Tittle);
  }
  
  
  @AfterClass
  public void tearDown() {
	   
	  driver.quit();
	  
  }
}

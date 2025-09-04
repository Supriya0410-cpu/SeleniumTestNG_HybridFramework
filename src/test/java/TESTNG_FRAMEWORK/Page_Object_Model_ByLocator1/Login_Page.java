package TESTNG_FRAMEWORK.Page_Object_Model_ByLocator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * PageObject=Encapsulation=private data + public method
 * 
 * constructor: to initialize driver
 * Locator: By class
 * Action: Methods
 */


public class Login_Page {
	
	
	//create private varibale 
	
	private WebDriver driver;
	
	//construstor to initlize driver
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver; //here we initilize the this class driver to base classs driver 
		
	}
	
	//locator 
	
	By email=By.id("input-email");//here first declare with variable then try to access the id method
	
	By Password= By.id("input-password");
	
	By Loginbtn=By.xpath("//input[@value='Login']");
	
	//methods 
	
	public String  GetAppURL()
	{
		
		return driver.getCurrentUrl();
		
	}
	

	public String  GetAppTittle()
	{
		
		return driver.getTitle();
		
	}
	
	
	
	
	public void Dologin( String emailId, String Password1 )
	{
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(Password).sendKeys(Password1);
		driver.findElement(Loginbtn).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

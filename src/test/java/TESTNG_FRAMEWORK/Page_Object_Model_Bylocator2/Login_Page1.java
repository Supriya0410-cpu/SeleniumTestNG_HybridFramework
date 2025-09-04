package TESTNG_FRAMEWORK.Page_Object_Model_Bylocator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page1 {

	
	//create private variable 
	private WebDriver driver;
	
	
	//constructor for Base class driver  
	public Login_Page1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//By locator 
	
	By username=By.xpath("//input[@id='user-name']");
	By password=By.xpath("//input[@id='password']");
	By loginbtn=By.id("login-button");
	
	
	
	//method
	
	
	public String getAppURL()
	{
	return 	driver.getCurrentUrl();
	}
	
	
	

	public String getAppTittle()
	{
	return 	driver.getCurrentUrl();
	}
	

	public void Dologin(String Username , String Password) 
	{
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginbtn).click();
	}
}

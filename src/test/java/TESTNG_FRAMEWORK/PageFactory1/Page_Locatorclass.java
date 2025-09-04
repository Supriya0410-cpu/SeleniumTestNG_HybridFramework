package TESTNG_FRAMEWORK.PageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Locatorclass {

	
	//declare variable as a private and method public --Encapsulation
	
	private WebDriver driver;
	
	
	//constructor to initlilize the \base class driver to this class
	
	public Page_Locatorclass( WebDriver driver)
	
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);//init method of page factory to initilize elements 
	}
	
	
	//Locators
	@FindBy(id="user-name")
	WebElement usernameele;
	
	
	@FindBy(xpath="//input[@id='password']")
	
	WebElement passwordele;
	
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//Methods 
	
	
	public void DoLogin(String userN, String PassW)
	{
		usernameele.sendKeys(userN);
		passwordele.sendKeys(PassW);
		
		loginBtn.click();
		
	}
	
	
	public String  getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String  getAppTittle()
	{
		return driver.getTitle();
	}
	
	
	
}

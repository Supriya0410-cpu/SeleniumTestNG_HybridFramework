package com.swaglabUITest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Loginpage {
	
	//Encapsulation = Private data member and public member function 
	
	private WebDriver driver;
	
	//Constructor 
	
	public P1_Loginpage(WebDriver driver)//base class driver 
	{
		this.driver= driver;
		//to initialize elements identified by @FindBy
		PageFactory.initElements(driver,this);
	}
	
	//locator
	
	@FindBy(id="user-name")
	WebElement usernameEle;
	
	@FindBy(id="password")
	WebElement passwoedEle;
	
	@FindBy(id="login-button")
	WebElement submitbutton;
	
	//action/method
	
	public String validatedappURL()
	{
		return driver.getCurrentUrl();//return use is best pratice for framework design 
	}
	
	public String validatedappTittle()
	{
		return driver.getTitle();
	}
	
	/*public P1_Loginpage setusername(String un)
	{
		usernameEle.sendKeys(un);
		return this;//if nothing to return return current claass object 
	}
	
	
	public P1_Loginpage setpassword(String psw)
	{
		passwoedEle.sendKeys(psw);
		return this;
	}
	
	public P2_InventoryPage clickbutton()
	{
		submitbutton.click();
		//if page landing to or nevigating to new page the n return 
		//next page object 
		return new P2_InventoryPage(driver);//follw this sysntax always 
	}
	*/
	
	public P2_InventoryPage doLogin(String un,String psw)
	{
		usernameEle.sendKeys(un);
		passwoedEle.sendKeys(psw);
		submitbutton.click();
		return new P2_InventoryPage(driver);
	}
	
	
	
	
	
	
	
	
}

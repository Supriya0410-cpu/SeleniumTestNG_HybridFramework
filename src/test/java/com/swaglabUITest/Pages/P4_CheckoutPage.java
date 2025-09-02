package com.swaglabUITest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_CheckoutPage {
	
	
	//Enapsulation public method private variables
	
	private WebDriver driver;
	
//	public constructor
	public P4_CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators 
	@FindBy(id="first-name")
	WebElement Fname;
	
	@FindBy(id="last-name")
	WebElement Lname;
	
	@FindBy(id="postal-code")
	WebElement Pcode;

	@FindBy(id="continue")
	WebElement ContinueBtn;
	//Methos/Action
	
	public P5_OverviewPage ContinueCheckout(String un, String psw,String pinc)
	{
		Fname.sendKeys(un);
		Lname.sendKeys(psw);
		Pcode.sendKeys(pinc);
		
		System.out.println("First name last name pincode :"+ un + psw + pinc);
		ContinueBtn.click();
		
		return new P5_OverviewPage(driver);
	}
}

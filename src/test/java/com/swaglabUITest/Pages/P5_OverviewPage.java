package com.swaglabUITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_OverviewPage {
	
	//Enapsulation private data member and public member function
	
	private WebDriver driver;
	
	//public const
	public P5_OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators 
	
	@FindBy(xpath="//div[@class='summary_info']//div[contains(@class,'summary')]")
	List <WebElement> allpaymentdetails;
	
	@FindBy(id="finish")
	WebElement FinishBtn;
	
	@FindBy(xpath="//h2")
	WebElement reMsg;
	
	
	public P5_OverviewPage getpaymentdetails()
	{
		for(WebElement i:allpaymentdetails)
		{
			System.out.println(i.getText());
		}
		
		return this;
	}
	
	public String docheckout()
	{
		FinishBtn.click();
		
		return reMsg.getText();
	}
	
	
	
}

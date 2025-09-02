package com.swaglabUITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_CartPage {
	
	//Enapsulation private data member and public member function 
	
	private WebDriver driver;
	
	//public constructor 
	
	public P3_CartPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
		
	}
	

	
	//ptivate locators
	
	@FindBy(xpath="//div[@class='cart_list']//div[@class='cart_item']")
	List <WebElement> allcartproducts;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removebtn;
	
	//xpath="//button[@id='continue-shopping']"
	@FindBy(id="continue-shopping")
	WebElement continueshoppingbtn;
	
	
	@FindBy(id="checkout")
	WebElement checkoutbtn;

	
	//methos/action
	
	public P3_CartPage getallproductdetaillscart()
	{
		int count=allcartproducts.size();
		System.out.println(count);
		
		
		for(WebElement i:allcartproducts)
		{
			System.out.println(i.getText());
		}
	
	return this;	
	}
	
	
	public P3_CartPage removeproductintocart(String pname)
	
	{
		for(WebElement i:allcartproducts)
		{
			if(i.getText().contains(pname))
			{
				removebtn.click();
			}
		}
		
		return this;
	}
	
	public P2_InventoryPage docontinueshopping()
	{
		continueshoppingbtn.click();
		//here its nevigating back to the 2nd page 
		return new P2_InventoryPage(driver);
	}
	
	
	
	public P4_CheckoutPage docheckout()
	{
		checkoutbtn.click();
		return new P4_CheckoutPage(driver);
	}
	
	
	
	
	
	
}

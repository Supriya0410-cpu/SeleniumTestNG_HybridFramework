package com.swaglabUITest.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_InventoryPage {

	//Encapsulation private data member and public member function

	private  WebDriver driver;

	//Public Constructor 
	public  P2_InventoryPage(WebDriver driver)//base class driver
	{
		this.driver=driver;
		//to initilize @Pagefactory element use init method 
		PageFactory.initElements(driver,this);

	}

	//Private Locator

	@FindBy(xpath="//div[@class='inventory_list']//div[@class='inventory_item']")
	private List<WebElement> products;

//	@FindBy(id="add-to-cart")
	//private	WebElement addtocartBtn;
	//button[contains(@class,'btn_primary')]
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory ']")
	private WebElement addtocartBtn;

	@FindBy(xpath=("//a[@class='shopping_cart_link']"))
	private	WebElement OriginalCart;
	//Method or actions 

	public int getproductCount()
	{
		return products.size();//getProductDetails
	}


	public P2_InventoryPage getProductDetails()
	{
		System.out.println("*******Product Details *****************");
		for(WebElement i:products)
		{
			System.out.println(i.getText());
		}
		return this; //best pratice to return someting from method 
	}




	public P2_InventoryPage addtocartbtnClick(String pname)
	{
		for(WebElement i:products)
		{
			if(i.getText().contains(pname))
				
			{
				//click on product
				i.click();
				System.out.println("product found "+pname);
				break;
			}
			

		}

		//clcik that cart button 
		addtocartBtn.click();
		return this ;
	}

	public P3_CartPage LaunchCartPage()
	{
		OriginalCart.click();
		//Page is nevigating to new page 
		return new P3_CartPage(driver);
	}


	//When You add the 78 no line immdiatily p1_loginpage show the error on last method 
	//where we declare this return statement 
	//to reslove error just add your Webdriver object in that constructor 

}

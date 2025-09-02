package com.swaglabUITest.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swaglabUITest.Base.BaseClass;
import com.swaglabUITest.utilities.ExcelUtility;

public class T3_CartTest extends BaseClass {

	
	
	//prerequisite
	//user should be login and product should be available in cart and cart page should open
	
	@BeforeClass
  public void setup() 
  {
  
		ip=lp.doLogin(ExcelUtility.getStringData("userdata", 0, 1),ExcelUtility.getStringData("userdata", 1, 1));
	addwait();
	ip=ip.addtocartbtnClick(prop.getData("pname1"));
	addwait();
	cp=ip.LaunchCartPage();

	
  }	
	
	@Test(priority=1)
	public void verifytotalproductincart()
	{
		cp.getallproductdetaillscart();
	}
	
	
	@Test(priority=2)
	public void removeproductintocart()
	{
		cp.removeproductintocart(prop.getData("pname1"));
	}
	
	
	@Test(priority=3)
	public void validatecontinueshoppingbtn() 
	{
		addwait();
		cp.docontinueshopping();
		addwait();
		//it nevigating back need to add new product in cart understand first funcatlity of the applucation
		ip.addtocartbtnClick(prop.getData("pname2"));
		addwait();
		ip.LaunchCartPage();
		
	}
	
	@Test(priority=4)
	public void validatecheckoutbtn() {
		
		cp.docheckout();
		 addwait();
	}
	
	
	
	
	
	
	
	
	
}

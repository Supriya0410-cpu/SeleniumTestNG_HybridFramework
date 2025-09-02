package com.swaglabUITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.swaglabUITest.Base.BaseClass;
import com.swaglabUITest.utilities.ExcelUtility;

public class T1_LoginTest extends BaseClass {
	
	
	
  @Test(priority=1)
  public void verifyUrl() {
	  
	  String exp =lp.validatedappURL();
	  String Act="saucedemo.com";
	  Assert.assertTrue(exp.contains(Act),"URL not matched ");
	  System.out.println("URL Matched");
  }
  
  @Test(priority=2)
  public void verifyTittle() {
	 String exp= lp.validatedappTittle();
	  String act=prop.getData("homepagetittle");
	  Assert.assertEquals(exp, act,"Tittle not matched");
	  System.out.println("Ttittle Matched");
  }
  @Test(priority=3)
  public void validatlogin() {
	//  lp.setusername("standard_user");
	//  lp.setpassword("secret_sauce");
	//  lp.clickbutton();
	lp.doLogin(ExcelUtility.getStringData("userdata", 0, 1), ExcelUtility.getStringData("userdata", 1, 1))  ;
	  
	  
	  Assert.assertTrue(lp.validatedappURL().contains("inventory.html"), "Landing next page sucessfully");
	  System.out.println("Login Completed!");
	  addwait();
  }
  
}

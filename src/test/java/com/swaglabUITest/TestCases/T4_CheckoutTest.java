package com.swaglabUITest.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swaglabUITest.Base.BaseClass;
import com.swaglabUITest.utilities.ExcelUtility;

public class T4_CheckoutTest extends BaseClass {
  //prerequsite

  @BeforeClass
  public void setup() {
	  
	  ip=lp.doLogin(ExcelUtility.getStringData("userdata", 0, 1),ExcelUtility.getStringData("userdata", 1, 1));
	addwait();
	ip=ip.addtocartbtnClick(prop.getData("pname2"));
	addwait();
	cp=ip.LaunchCartPage();
	addwait();
	cp.docheckout();
	  
	addwait();
  }
  
  @Test(priority=1)
  public void validatecheckout()
  {
	  ch.ContinueCheckout(ExcelUtility.getStringData("userdata", 2, 1), ExcelUtility.getStringData("userdata", 3, 1), ExcelUtility.getAllTypeData("userdata", 4, 1));
	  addwait();
  }
  
 
}

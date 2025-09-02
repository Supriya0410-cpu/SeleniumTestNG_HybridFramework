package com.swaglabUITest.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swaglabUITest.Base.BaseClass;
import com.swaglabUITest.utilities.ExcelUtility;

public class T2_InventoryTest extends BaseClass {
 
	//Prerequestite to run before this page need to enter the login credentails 
	
	@BeforeClass
	public void Login()
	{
		ip=lp.doLogin(ExcelUtility.getStringData("userdata", 0, 1),ExcelUtility.getStringData("userdata", 1, 1));
		addwait();
	}
	
	@Test(priority=1)
  public void Validatethecount() {
	  int Pcount=ip.getproductCount();
	  System.out.println("Procut count is "+Pcount);
  }
	
	@Test(priority=2)
	public void ValidateProductDeatils()
	{
		ip.getProductDetails();
	}
	
	@Test(priority=3)
	public void ValidateAddtocart()
	{
		ip.addtocartbtnClick(prop.getData("pname1"));
	}
	
	@Test(priority=4)
	public void validateCartPageLaunch()
	{
	
		ip.LaunchCartPage();
	
		 addwait();
		
	}
	
	
	
	
/*When i run test got failed to reslove this we need to add preRequsite step here in this class 
	//and use TESTNG annotationas properly 
	
Before test == before all class 
This is depend on xml file structure 
<test>
<class>
Class 1 or your class
Calss2 or your class
</class>
</test >

Before class= this is depend only one class or  that class
	
	*/
	
/*	
While Running through the XML file need to use proper annotations and xml file structure structure 	
	
Best Pratice Make a seperate Test suite of each class and run crossverify annotation meaning again and then run 	
	
	*/
	
}

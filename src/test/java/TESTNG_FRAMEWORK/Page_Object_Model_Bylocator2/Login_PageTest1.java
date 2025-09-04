package TESTNG_FRAMEWORK.Page_Object_Model_Bylocator2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_PageTest1 extends BaseClass {
  
	
	
	@Test(priority=1)
  public void ValidateappURL() {
	String acturl=lp.getAppURL();	
	String expurl="demo";
	Assert.assertTrue(acturl.contains(expurl), "Url contains demo");
	System.out.println("url matched ");
	
  }
	

	
	
	@Test(priority=2)
  public void CompleteLogin() {
		
		
		
	lp.Dologin("standard_user","secret_sauce");	
	Assert.assertEquals(driver.getTitle().contains("Swag") ,"Tittle not matched ");
	System.out.println("login completed ");
	
  }
}


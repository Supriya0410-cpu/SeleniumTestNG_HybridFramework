package TESTNG_FRAMEWORK.PageFactory1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLocatorTest extends BaseClass{
  
	
	
	@Test(priority=1)
  public void ValidateURL() {
		
	//this methods need to be define in the locator class then use test class
		String ActURL=lp.getAppUrl();
		String ExpUrl="saucedemo";
		
		Assert.assertTrue(ActURL.contains(ExpUrl), "Url not contains saucedemo");
		
		System.out.println("URL matched ...");
  }
  
  
  
  @Test(priority=2)
  public void ValidateTittle() {
	  
	String ActTittle=  lp.getAppTittle();
	String ExpTittle="Swag";
	
	Assert.assertTrue(ActTittle.contains(ExpTittle), "Tittle not contains Swag");
	
	System.out.println("Tittle  matched ...");
	  
	  
  }
  
  
  
  @Test(priority=3)
  public void CompleteLogin() {
	  lp.DoLogin("standard_user", "secret_sauce");
	  
	 String  expURL="inventory";
	 
	 Assert.assertTrue(lp.getAppUrl().contains(expURL), "Url not contains inventory");
	 
	 ///Assert.assertEquals(lp.getAppUrl().contains(expURL),"Url Not matched");
	 
	 System.out.println("URL matched Completed Login ...");
	  
  }
}

package TESTNG_FRAMEWORK.Page_Object_Model_ByLocator1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Page_Test extends BaseTest{
 
	
	
	
	
	@Test(priority=1)
  public void ValidateURL() {
		String ActUrl=lp.GetAppURL();
		String ExpUrl="login";
		
        Assert.assertTrue(ActUrl.contains(ExpUrl),"Url not contains Login");
        
        System.out.println("URL matched");
  }
	
	
	@Test(priority=2)
	  public void ValidateTittle() {
		
		String ACT=lp.GetAppTittle();
		String EXP="Account Login";
		
		Assert.assertEquals(ACT, EXP, "Tittle contains the account login");
		System.out.println("tittle matched");
	  }
	
	
	@Test(priority=3)
	  public void completelogin() {
		
		lp.Dologin("test24@gmail.com", "test123");
		//String ExpUrl="account/account";
		//Assert.assertTrue(lp.GetAppURL().contains(ExpUrl), "Url not contains account ");
		
		System.out.println("Login Completed sucessfully");
		
	  }
	
}

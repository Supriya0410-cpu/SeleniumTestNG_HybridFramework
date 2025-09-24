package Com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Com.utility.BrowserProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLab_Stepdef {

	//public WebDriver driver;// driver is null 
	
	WebDriver driver=BrowserProvider.getdriver();
	
	@Given("SwagLab Application should be open using this link {string}")
	public void swag_lab_application_should_be_open_using_this_link(String url) {
		
	//	driver= new EdgeDriver();
	    driver.get(url);
	}

	@When("Enter the valid username as {string} and valid password is {string}")
	public void enter_the_valid_username_as_and_valid_password_is(String un, String psw) {
	    
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User should able to clik login page")
	public void user_should_able_to_clik_login_page() {
	    
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User should able to view inventory page")
	public void user_should_able_to_view_inventory_page() {
		
		String ACTurl=driver.getCurrentUrl();
		String EXPurl="inventory";
		
		Assert.assertTrue(ACTurl.contains(EXPurl),"Test Failed ");
		
		System.out.println(" Test Passes");
		
		
		
		
		
		
		
	    
	}
}

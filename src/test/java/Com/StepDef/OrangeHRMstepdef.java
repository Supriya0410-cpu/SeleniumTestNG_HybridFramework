package Com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMstepdef {

	WebDriver driver;
	
	@Given("Open orange application")
	public void open_orange_application() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String un, String psw) {
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	  
	}

	@When("user click on login button of hrm page")
	public void user_click_on_login_button_of_hrm_page() throws InterruptedException {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1500);
	}

	@Then("for valid user data user should able to dashboard page")
	public void for_valid_user_data_user_should_able_to_dashboard_page() {
		
		String actUrl=driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains("dashboard"),"Login Fail");
		System.out.println("Login pass!");
	   
	}


}

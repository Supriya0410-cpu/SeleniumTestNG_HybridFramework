package Com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepdef {

	public WebDriver driver;
	
	
	@Given("Amazon application should open")
	public void amazon_application_should_open() {
		
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		
	  
	}

	@When("User should able to click the amazon home page")
	public void user_should_able_to_click_the_amazon_home_page() {
		
		String Acturl=driver.getCurrentUrl();
	  
	}

	@Then("user should validate the tittle of home page")
	public void user_should_validate_the_tittle_of_home_page() {
		
		String Acturl=driver.getCurrentUrl();
		String expurl="amazon";
	   Assert.assertTrue(Acturl.contains(expurl),"Tittle not macthed");
	   System.out.println("Tittle matched ");
	}

	@When("user should able to click the amazon mxplayer page")
	public void user_should_able_to_click_the_amazon_mxplayer_page() {
		
		driver.findElement(By.xpath("(//div[@class=\"nav-div\"])[4]")).click();
	   
	}

	@Then("user should able to validate amazon tittle of mxplayer page")
	public void user_should_able_to_validate_amazon_tittle_of_mxplayer_page() {
		
		String Acturl=driver.getCurrentUrl();
		String expurl="desktop";
	   Assert.assertTrue(Acturl.contains(expurl),"Tittle not macthed");
	   System.out.println("Tittle matched ");
	}

	@When("user should able to click the sell page of amazon")
	public void user_should_able_to_click_the_sell_page_of_amazon() {
		
		driver.findElement(By.xpath("(//div[@class=\"nav-div\"])[5]")).click();
	   
	}

	@Then("user should able to validate tittle of sell page")
	public void user_should_able_to_validate_tittle_of_sell_page() {
		
		String Acturl=driver.getCurrentUrl();
		String expurl="sell";
	   Assert.assertTrue(Acturl.contains(expurl),"Tittle not macthed");
	   System.out.println("Tittle matched ");
	   
	}

	@When("user should able to click the mobiles page")
	public void user_should_able_to_click_the_mobiles_page() {
	   
		driver.findElement(By.xpath("(//div[@class=\"nav-div\"])[8]")).click();
		
	}

	@Then("user should able to validate tittle of mobiles page")
	public void user_should_able_to_validate_tittle_of_mobiles_page() {
		
		String Acturl=driver.getCurrentUrl();
		String expurl="mobiles";
	   Assert.assertTrue(Acturl.contains(expurl),"Tittle not macthed");
	   System.out.println("Tittle matched ");
	    
	}


}

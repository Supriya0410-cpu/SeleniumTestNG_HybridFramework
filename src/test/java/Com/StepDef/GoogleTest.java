package Com.StepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleTest {

	WebDriver driver;
	String CurrentTittle;
	
	@Given("Open Google application")
	public void open_google_application() {
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.google.com");
	    
	}

	@When("user get the current titile of application")
	public void user_get_the_current_titile_of_application() {
		
		
		CurrentTittle=driver.getTitle();
	  
	}

	@Then("tittle should be Google")
	public void tittle_should_be_google() {
		
		String ACTtittle="Google";
		Assert.assertEquals(CurrentTittle, ACTtittle,"Tittle not matcched ");
		
		System.out.println("Tittle matched ");
	    
	}

	@When("user able to enter {string} keyword in search box")
	public void user_able_to_enter_keyword_in_search_box(String Keyword) {
	    
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys(Keyword);
	}

	@Then("appropriate result should open based on search keyword")
	public void appropriate_result_should_open_based_on_search_keyword() {
		
		List <WebElement> allele=driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]//li"));
		System.out.println("all elements are "+allele.size());
		
		for(WebElement i :allele)
		{
		System.out.println(i.getText());
		}
		
	    
	}
	
	
	
	
	
	
	
	
}

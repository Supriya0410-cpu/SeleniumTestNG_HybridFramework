package Com.StepDef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartStepdef {

	public WebDriver driver; 
	
	
	@Given("open the OpenCart application")
	public void open_the_open_cart_application() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	
/*
 * For this method first remove import statement and add above of class name 
 * Second change method variable name 
 * We are passing data through the Key value pair
 * That is the reason we are using a Map 
 *asmap() method used to get data in key value pair  
 * 
 * 
 */
	
	
	@When("user enter valid feilds")
	public void user_enter_valid_feilds(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	List<Map<String,String>> tabledata=	table.asMaps();
	
	driver.findElement(By.id("input-firstname")).sendKeys(tabledata.get(0).get("fname"));
		
	driver.findElement(By.id("input-lastname")).sendKeys(tabledata.get(0).get("lname"));	
		
	driver.findElement(By.id("input-email")).sendKeys(tabledata.get(0).get("email"));
	
	driver.findElement(By.name("telephone")).sendKeys(tabledata.get(0).get("telephone"));
		
	
	
	driver.findElement(By.id("input-password")).sendKeys(tabledata.get(0).get("password"));
	
	driver.findElement(By.id("input-confirm")).sendKeys(tabledata.get(0).get("cpassword"));
	
		
	}

	@When("user click on radio button")
	public void user_click_on_radio_button() {
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("user clcik on the privacy checkbox")
	public void user_clcik_on_the_privacy_checkbox() {
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@When("user clcik on Continue  button")
	public void user_clcik_on_continue_button() {
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  }

	@Then("user should able to regester and get valid message")
	public void user_should_able_to_regester_and_get_valid_message() {
	 String acttittle=  driver.getPageSource();
	 Assert.assertTrue(acttittle.contains("success"),"Tittle not matched");
	 
	 System.out.println("user login sucessfully ");
	 
	 
	 
	 
	}

}

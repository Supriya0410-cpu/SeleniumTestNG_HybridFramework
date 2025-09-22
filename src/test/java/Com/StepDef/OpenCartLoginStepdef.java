package Com.StepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartLoginStepdef {

	public WebDriver driver;
	
	@Given("open cart application login page")
	public void open_cart_application_login_page() {
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	   
	}
	
	/*For this method first remove import statement and add above of class name 
     * Second change method variable name 
	 * Here we are using normal list bcz we have only one list of only key 
	 * using method cells 
	 * 
	 * 
	 * 
	 * 
	 */

	@When("user enter valid credentails")
	public void user_enter_valid_credentails(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List <List <String>> tabledata=table.cells();	
		
		driver.findElement(By.id("input-email")).sendKeys(tabledata.get(0).get(0));
		driver.findElement(By.id("input-password")).sendKeys(tabledata.get(0).get(1));
	}

	@When("user click on the login button of login page")
	public void user_click_on_the_login_button_of_login_page() {
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should able to login account page")
	public void user_should_able_to_login_account_page() {
	  String acturl= driver.getCurrentUrl();
	  
	  Assert.assertTrue(acturl.contains("account"),"Login failed");
	  
	  System.out.println("Login completed ");
	}

}

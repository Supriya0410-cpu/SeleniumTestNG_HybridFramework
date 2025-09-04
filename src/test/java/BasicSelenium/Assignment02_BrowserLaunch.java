package BasicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// import statement_key (ctrl+shift+O) 

public class Assignment02_BrowserLaunch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		System.out.println("****************************URL Validation****************************************8");
		if(driver.getCurrentUrl().contains("saucedemo")) //URL Validation 
		{
			System.out.println("Enterted URL is Correct");
		}
		else
		{
			System.out.println("Please cross verify the URL");
		}
		
		System.out.println("***********************Tittle Validation**********************");
		
		String Tittle=	driver.getTitle(); //Title Validation 

		if(Tittle.equals("Swag Labs"))
		{
			System.out.println("Validation Sucess PProceed with further steps ");
		}

		else
		{
			System.out.println("Someting went wrong please check the URL");
		}

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		//       OR 
		//driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);

	}

}

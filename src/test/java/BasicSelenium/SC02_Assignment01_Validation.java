package BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC02_Assignment01_Validation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//To open the application
		driver.get("https://automationplayground.com/crm/");
		String URL= driver.getCurrentUrl();
		
		if(URL.contains("crm"))
		{
			System.out.println("URL Contaiins the CRM");
		}
		else
		{
			System.out.println("URL not contains CRM ");
		}
		//To get the tittle of url 
		System.out.println("Page tittle is :-"+driver.getTitle());

		String currentTitle= driver.getTitle();

		String	Expctedtitle= currentTitle;

		System.out.println(Expctedtitle);

		if(currentTitle.equals(Expctedtitle))
		{
			System.out.println("Tittle matched");
		}
		else
		{
			System.out.println("Tittle not matched");
		}
		driver.quit();
	}

}

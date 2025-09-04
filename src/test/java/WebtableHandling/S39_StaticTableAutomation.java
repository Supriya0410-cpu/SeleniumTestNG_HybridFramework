package WebtableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S39_StaticTableAutomation {
	@Test
	public void statictable() {



		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://testautomationpractice.blogspot.com/");


		System.out.println("*********Number of heading**********");

		List <WebElement> allelement=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));

		for(WebElement i:allelement)
		{
			System.out.println(i.getText());

		}

		System.out.println("*********Number of rows**********");


		List<WebElement> allele2=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));

		for(WebElement i:allele2)
		{

			System.out.println(i.getText());
		}

		System.out.println("*********Number of columns**********");

		List<WebElement> allele3=  driver.findElements(By.xpath("//table[@name='BookTable']//tbody//th"));


		for(WebElement i:allele3)
		{

			System.out.println(i.getText());
		}



		System.out.println("************Specific row data***********");

		List <WebElement> ele4=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[3]//td"));

		for(WebElement i:ele4)
		{

			System.out.println(i.getText());
		}




		System.out.println("************Specific coloumn data***********");

		List <WebElement> ele5=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[1]"));

		for(WebElement i:ele5)
		{

			System.out.println(i.getText());
		}



		System.out.println("************Specific coloumn data***********");

		List <WebElement> ele6=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));

		for(WebElement i:ele6)
		{

			System.out.println(i.getText());
		}



		System.out.println("************Specific coloumn data woth total price***********");

		List <WebElement> ele7=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));

		String total=null;
		for(WebElement i:ele7)
		{

			
		
			total=i.getText();
		}

		System.out.println(total);
		




	}
}

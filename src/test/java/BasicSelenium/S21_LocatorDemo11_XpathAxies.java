package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_LocatorDemo11_XpathAxies {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=zdfasd&submit-name=");


		System.out.println("Scenario1: get Parent tag name for John element");

		String Tname=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent Tag name of john is :"+Tname);


		System.out.println("Scenario2: get grand parent tag name for John element");

		String gname=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();

		System.out.println("Grand parent Tag name of john is :"+gname);


		System.out.println("Scenario3: get number of childs for row 2");

		int cname=driver.findElements(By.xpath("//tbody//tr[2]//child::td")).size();

		System.out.println(" number of childs for row 2 are :"+cname);



		System.out.println("Scenario4: after John all remaining rows:following");


		int fname=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();

		System.out.println(" after John all remaining rows are :"+fname);

		System.out.println("****************************Assignment *******************************");

		System.out.println("Scenario5: after Ashley get all remaining data count:following");

		int fname1=driver.findElements(By.xpath("//tbody//tr[2]//following::td")).size();

		System.out.println("after Ashley all remaining data count are :"+fname1);


		System.out.println("Scenario6: after Ashley get all siblings");


		int fsname=driver.findElements(By.xpath("//tbody//tr[2]//following-sibling::td")).size();

		System.out.println(" after Ashley all siblings are :"+fsname);


		System.out.println("Scenario7: Before Ashley get all siblings");

		int psname=driver.findElements(By.xpath("//tbody//tr[2]//preceding-sibling::td")).size();

		System.out.println(" Before Ashley all siblings are :"+psname);


		System.out.println("Scenario8: Before Ashley get all rows count");
		

		int pcount=driver.findElements(By.xpath("//tbody//tr[2]//preceding::tr")).size();

		System.out.println(" number of childs for row 2 are :"+pcount);
		
		System.out.println("Scenario 9: Before Ashley get all data count");
		
		int dcount=driver.findElements(By.xpath("//tbody//tr[2]//preceding-sibling::td")).size();

		System.out.println(" Before Ashley all data count is:"+dcount);
		
		

	}

}

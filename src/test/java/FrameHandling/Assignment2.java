package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment2 {
	@Test
	public void Assignment() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/nested_frames");


		//switch to frame using attribute name
		//Parent frame1
		driver.switchTo().frame("frame-top");
		System.out.println(driver.getPageSource());
		
		
		//Frame left
		driver.switchTo().frame("frame-left");
		System.out.println(driver.getPageSource());


		//MIDDLE FRAME in this parent frame there are 3 frames nested frame
		//parent-->child frame

		driver.switchTo().defaultContent();
		WebElement ele2= driver.findElement(By.xpath("//frameset//frame[@src='/frame_middle']"));
		driver.switchTo().frame(ele2);
		System.out.println(driver.getPageSource());
		

		//Frame RIGHT this is aslo in top frame so no need to switch parent frame
		//parent-->child 

		WebElement ele3= driver.findElement(By.xpath("(//frame)[3]"));

		driver.switchTo().frame(ele3);
		System.out.println(driver.getPageSource());
		//WebElement ele2= driver.findElement(By.id("content"));

		//2nd frame

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.getPageSource());

		
	}
}

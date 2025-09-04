package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameAssignment1 {
	@Test
	public void Assignment1() {


		WebDriver driver= new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

		//Frame 4th
		WebElement ele5=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(ele5);

		driver.findElement(By.name("mytext4")).sendKeys("This is frame 4");


		//5th frame 

		driver.switchTo().defaultContent();

		WebElement ele6=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(ele6);

		driver.findElement(By.name("mytext5")).sendKeys("This is frame 5");




	}
}

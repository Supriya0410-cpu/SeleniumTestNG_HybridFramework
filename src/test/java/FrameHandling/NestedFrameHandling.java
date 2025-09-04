package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrameHandling {
	@Test
	public void NestedFrame() {


		WebDriver driver= new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

		//Frame 1
		//switch frame with index 
		// driver.switchTo().frame(0);



		WebElement ele2=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(ele2);

		driver.findElement(By.name("mytext1")).sendKeys("This is frame 1");


		//For 2nd frame first need to go the parent frame then able to swithch 2nd frame
		//for parent or first frame swith  
		driver.switchTo().defaultContent();

		//frame2

		WebElement ele3=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(ele3);

		driver.findElement(By.name("mytext2")).sendKeys("This is frame 2");



		//In frame 3 there are in 3 frame that is known the nested frame 

		//To go parent window
		driver.switchTo().defaultContent();


		//3RD Frame
		WebElement ele4=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(ele4);

		driver.findElement(By.name("mytext3")).sendKeys("This is frame 3");


// Frame control is in the 3rd frame and we need to automate frame under frame 3 
//no need to switch paraent frame bcz control is already frame3
		
		//parent--->childframe(iframe tag)
		
		WebElement ele=driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		

//Frame 4th need to switch parent window
		
		driver.switchTo().defaultContent();
		
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

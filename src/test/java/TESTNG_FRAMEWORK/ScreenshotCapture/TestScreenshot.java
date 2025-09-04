package TESTNG_FRAMEWORK.ScreenshotCapture;
import org.testng.annotations.Test;

import Generic.ScreenshotUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
/*
 * in simple screen shot we atr able to capture only active window ss not whole / full window 
 * for fullwindow we have seperate class= ashot
 * 
 * 
 */
import org.testng.annotations.Test;

public class TestScreenshot {
  @Test
  public void simpless() throws Exception {
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  ScreenshotUtility.getscreenshot(driver, "Amazonpage1");
	  
	  //for the date enter in ss
	 /* Date date = new Date ();
	  SimpleDateFormat sm = new SimpleDateFormat("YYYY.MM.DD:HH.MM.SS");
	  String TimeStamp=sm.format(date);*/
	  
	/* //Replacement of above code 
	  String TimeStamp=new SimpleDateFormat("YYYY.MM.DD:HH.MM.SS").format(new Date());
	  
	 // typecasting requried 
	  TakesScreenshot ts= (TakesScreenshot) driver;
	  
	  File temp= ts.getScreenshotAs(OutputType.FILE);
	  
	//Destination file path 

	  File dest= new File(System.getProperty("user.dir")+"//Screenshots//Amzonpage"+TimeStamp+".png");
	  
	 FileHandler.copy(temp,dest); */
	  
	 //driver.close();
  }
}

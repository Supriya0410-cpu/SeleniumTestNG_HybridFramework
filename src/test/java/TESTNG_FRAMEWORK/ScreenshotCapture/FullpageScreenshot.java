package TESTNG_FRAMEWORK.ScreenshotCapture;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

/*
 * For Full page screenshot we have a external library = Ashot library
 * https://github.com/pazone/ashot
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.ScreenshotUtility;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullpageScreenshot {
	@Test
	public void fullpagess() {

		WebDriver driver= new ChromeDriver();
		//  driver.get("https://tutorialsninja.com/demo/");
		 driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
	
		ScreenshotUtility.fullpage(driver,"NewQAfox");

		/* //Timestamp
	  String timestamp= new SimpleDateFormat("YYYY.MM.DD.HH.MM,SS").format(new Date());

	  //Full page screenshot 
	  //change your WebDriver object name
	 Screenshot ss= new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);

	 //destenation file path 

	  File dest= new File(System.getProperty("user.dir")+"//Screenshots//QAFoxpage"+timestamp+".png");

	  //for the full page ss we need follwing command
	  try {
		ImageIO.write(ss.getImage(), "PNG", dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

		//driver.close();  

	}
}

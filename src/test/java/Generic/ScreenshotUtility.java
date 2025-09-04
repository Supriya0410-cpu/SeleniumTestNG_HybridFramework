package Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUtility {

	public static void getscreenshot(WebDriver driver, String filename)
	{
		String TimeStamp=new SimpleDateFormat("YYYY.MM.DD:HH.MM.SS").format(new Date());

		// typecasting requried 
		TakesScreenshot ts= (TakesScreenshot) driver;

		File temp= ts.getScreenshotAs(OutputType.FILE);

		//destenation file path 

		File dest= new File(System.getProperty("user.dir")+"//Screenshots"+filename+TimeStamp+".png");

		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void fullpage(WebDriver driver, String filename)
	{

		String timestamp= new SimpleDateFormat("YYYY.MM.DD.HH.MM,SS").format(new Date());


		Screenshot ss= new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);


		File dest= new File(System.getProperty("user.dir")+"//Screenshots"+filename+timestamp+".png");


		try {
			ImageIO.write(ss.getImage(),"PNG",dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

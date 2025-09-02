package com.swaglabUITest.Base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.swaglabUITest.Pages.P1_Loginpage;
import com.swaglabUITest.Pages.P2_InventoryPage;
import com.swaglabUITest.Pages.P3_CartPage;
import com.swaglabUITest.Pages.P4_CheckoutPage;
import com.swaglabUITest.Pages.P5_OverviewPage;
import com.swaglabUITest.utilities.BrowserProvider;
import com.swaglabUITest.utilities.PropertiesFileUtility;

public class BaseClass {


		public static WebDriver driver;
	    public P1_Loginpage lp;
	    public P2_InventoryPage ip;
		public P3_CartPage cp;
		public P4_CheckoutPage ch;
		public P5_OverviewPage op;
		
		public PropertiesFileUtility prop;
		
		
		
		
		
		@BeforeTest
		@Parameters({"bname"})
		public void setUp(String bname)
		{
			
			 prop=new PropertiesFileUtility("confing");//filename
		
			 driver=BrowserProvider.SetDriver(bname);
		   
			//To repacement of below line we cretae the Broser provider utility 
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getData("url"));
	     	lp=new P1_Loginpage(driver);//our chrome driver 
	     	ip=new P2_InventoryPage(driver);
	     	cp=new P3_CartPage(driver);
	     	ch=new P4_CheckoutPage(driver);
	     	op=new P5_OverviewPage(driver);
		}
		
		
		
		public static void addwait()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}

		public static void  handlealert()
		{
			Alert l1=driver.switchTo().alert();
			
			//to click on that ok button 
			l1.accept();
		}
}

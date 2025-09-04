package TESTNG_FRAMEWORK.PropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.PropertiesFileUtility;

public class TestPropertiesFile {
  @Test
  public void testpropertiesfile () throws IOException {
	  
	//read data from file we need path
	 // File f1= new File(System.getProperty("user.dir") +"ConfigData//Config.properties");
	  
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  //read a file in stream: FileInputStream
	  FileInputStream fs = new FileInputStream(f1);
	  
	  //create object of Properties class
	  
	  Properties p1= new Properties();
	  
	  //load the file
	  
	  p1.load(fs);
	  
	  System.out.println("***************");
	  
	  //Create a driver 
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get(p1.getProperty("url"));
	  
	  //find the locator
	  
	  driver.findElement(By.id(p1.getProperty("unlocid"))).sendKeys(p1.getProperty("un"));
	  
	  
	  driver.findElement(By.id(p1.getProperty("pswlocid"))).sendKeys(p1.getProperty("psw"));
	  
	  driver.findElement(By.id(p1.getProperty("loginid"))).click();
	   
  }
  
  public void withUtility()
  {
	  PropertiesFileUtility p11=new PropertiesFileUtility("config");
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get(p11.getData("url"));
 //username
	  
	  driver.findElement(By.id(p11.getData("unlocid"))).sendKeys(p11.getData("un"));
	  
	  //password
	  driver.findElement(By.id(p11.getData("pswlocid"))).sendKeys(p11.getData("psw"));
	  
	  //login
	  driver.findElement(By.id(p11.getData("loginid"))).click();
	  
  }
}

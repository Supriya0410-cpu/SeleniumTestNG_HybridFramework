package com.swaglabUITest.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Utilities1 {
  @Test
  public static void Selectdropdown(WebElement ele, String Actul ) {
	  
	  

		Select d1= new Select(ele);
		
		System.out.println(" check whetehr the lis able to select multiple element : "+d1.isMultiple());
		
		List <WebElement> ele2=d1.getOptions();
		System.out.println("all list count :"+ ele2.size());
		
		for(WebElement i:ele2)
		{
		 System.out.println(i.getText());
			
		 if(i.getText().contains(Actul)) {
			 
			i.click();
			break;
		 }
		}
	  
	  
  }
  
  
  public static boolean Switchtorightwindow(String expTittle, WebDriver driver, List<String> allid) {
	  
	  
	  for(String windowid :allid)
	  {
		  // to retrive the tittle of pages
		  String actTittle=driver.switchTo().window(windowid).getTitle();
		  
		  if(actTittle.equals(expTittle))
		  {
			  System.out.println("correct window");
		  }
		  
	  }
	  return false;
	  
	  
	  
	  
	  
  }
  
  
  public static WebElement WebDriverWaitelementtoclickable(WebDriver driver ,By loc) 
  {
	  
	 WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(5));
	return wait3.until(ExpectedConditions.elementToBeClickable(loc));
	
  }
  
  public static WebElement WebDriverWaitVisisblityOfElement(WebDriver driver ,By loc) {
	  
	  WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(6));
		return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
  }
  
  
  
  public static WebElement WebDriverWaitPresenceofElemet(WebDriver driver ,By loc){
	  WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait2.until(ExpectedConditions.presenceOfElementLocated(loc));
  }
  
  
  public static Boolean WebDriverWaitURLContains(WebDriver driver) {
	  
	  WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(5));
	return  wait3.until(ExpectedConditions.urlContains("demo"));
	  
  }
  
 public static Boolean WebDriverWaitpagetittlecontains(WebDriver driver) {
	  
	  WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(5));
	return  wait4.until(ExpectedConditions.urlContains("login"));
	  
  }
  
}

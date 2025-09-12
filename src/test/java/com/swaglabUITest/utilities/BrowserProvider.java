package com.swaglabUITest.utilities;

import org.openqa.selenium.WebDriver;

public class BrowserProvider {
	
	
	
	/*
	 * ThreadLocal is class in java used to design one thread through out all the test case/pages
	 *Methods
	 *-------
	 *get()
	 *set()
	 */
	
	public static WebDriver driver;
	
	//Here first intilize the normal way after that according to warining add the TYpe wEBDRIVER
	public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver SetDriver(String bname)
	{
		switch(bname)
		{
		
		case "Chrome" :
			
		break;
		
		case "Edge":
			
		break;
			
		case "Firefox":
		
		break;
		
		}
		
		tdriver.set(driver);
		return getdriver();
		
		
		
		
	}


	private static WebDriver getdriver() {
		
		return tdriver.get();
	}
	
	
	
	

}

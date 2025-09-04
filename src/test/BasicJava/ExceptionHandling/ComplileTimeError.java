package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * Compile Time Exception is an JVM responsibility to handle this exception
 * 
 * 
 * 
 */
public class ComplileTimeError {

	public static void main(String[] args) throws InterruptedException, IOException  {

		System.out.println("Program started ");

		Thread.sleep(2000);

		System.out.println("Program stoped ");

		System.out.println("************Config.Properties File Example ***************************** ");
		
		//read data from file follow following steps
		
		//Step 1: Get the address of the file 
		
		//Two ways to add path this is very complex way or it may cause error 
		File f1= new File("C:\\Users\\BusinessComputers.in\\eclipse-workspace\\JavaSkills\\Config.properties");
		
		
		
		//Step2 : read as a stream [ read whole data not char by char whole string value present in file]
		
		FileInputStream fm= new FileInputStream(f1);
		
		//step 3:for properties file in java we have a class Properties, create object of properties file
		
		Properties ps = new Properties();
		
		//step 4:load the file using object of properties file 
		
		ps.load(fm);
		
		//step5:use method getProperty(Key)--->value
		
		System.out.println(" Browser name:"+ps.getProperty("BrowserName"));
		System.out.println(" Browser name:"+ps.getProperty("BrowserVersion"));
		
		
		
		
	}

}

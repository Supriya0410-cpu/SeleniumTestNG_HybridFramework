package com.swaglabUITest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {

	public Properties p1;
	
	public  PropertiesFileUtility(String fileName)
	{
		//create object of Properties class
		
		 p1= new Properties();
		
		//read data from file we need path
		//here i need to changethe foldername bcz in hybrid framework i have give diff name you can change accrding to upu
	//	File f1= new File(System.getProperty("user.dir")+"//ConfigData//"+fileName+".properties");
		File f1= new File(System.getProperty("user.dir")+"//Configfiles//"+fileName+".properties");
		//Create object of fileInputStream
		
		FileInputStream fs;
		try {
			 fs= new FileInputStream(f1);
			
				p1.load(fs);
				
		}
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("file path is wrong");
				}
				
			 catch (IOException e)
			 {
				// TODO Auto-generated catch block
				System.out.println("properties file not loaded");
			}
		
	}
		
		
		public String getData(String key)
		{
			return p1.getProperty(key);
		}
		
		
		
		
		
		
	
		
	}


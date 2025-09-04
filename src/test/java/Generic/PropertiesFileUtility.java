package Generic;

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
		
		Properties p1= new Properties();
		
		//read data from file we need path
		
		File f1= new File(System.getProperty("user.dir")+"//ConfigData//"+fileName+".properties");
		
		//Create object of fileInputStream
		
		FileInputStream fs;
		try {
			 fs= new FileInputStream("");
			
				p1.load(fs);
				
		}
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 catch (IOException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		
		
		public String getData(String key)
		{
			return p1.getProperty(key);
		}
		
		
		
		
		
		
	
		
	}


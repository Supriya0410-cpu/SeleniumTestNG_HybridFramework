package TESTNG_FRAMEWORK.TestDataUsingXMlFile;


import org.testng.annotations.Test;

import Generic.ExcelUtility;

public class XmlUtilityTest {
  @Test
  public void testAll() {
	  
	String Data= ExcelUtility.getStringData("BookData",2,1);
	System.out.println(Data);
	
	
	
	
	
String data1=	ExcelUtility.getAllTypeData("BookData", 3, 2);
	
	System.out.println(data1);
	
	 double price=Double.valueOf(data1);
	 
	  
	  System.out.println("Price for cucumber book: "+(int)price);
	
  }
  
  
  
  
  
  
 
}

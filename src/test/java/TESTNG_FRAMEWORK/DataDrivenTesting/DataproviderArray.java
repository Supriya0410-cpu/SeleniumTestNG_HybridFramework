package TESTNG_FRAMEWORK.DataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderArray {
	
	/*@DataProvider(name="mydata")
	public Object[][] testdata()
	{
		Object[][] data= {{"Amit", "amit123"},{"sujeet","sujeet123"},{"sukanya","sukanya123"},{"sujata","sujata123"}};
	return data;
	}
	*/
	
	
  @Test(dataProvider="mydata",dataProviderClass=CustomeData.class)
  public void testcase(String un , String psw) {
	  System.out.println("username is:"+un);
	  System.out.println("password is: "+psw);
  }
}
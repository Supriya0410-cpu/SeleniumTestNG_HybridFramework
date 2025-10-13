package Com.APIBasic;
/*
 * Imp Inteview Quetion how to monitor api 
 * 
 * 
 */
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T04APIMonitorinng {
  @Test
  public void f() {
	  
	  while(true) 
	  {
	  Response res=RestAssured.get("https://www.google.com/");
	  
	  int actCode=res.getStatusCode();
	  
	  if(actCode==200)
	  {
		  System.out.println("Status code is: "+actCode);
	  }
	  
	  }
  }  
	  
  
}

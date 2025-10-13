package Com.APIBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T05_JSONBodayValidations {
  @Test
  public void testJSONBodayResponse() {
	  
	  Response res=RestAssured.given().header("x-api-key","reqres-free-v1").get("https://reqres.in/api/users/2");
	  
		 System.out.println(res.asPrettyString());
		 
		 
		//id is 2
		int actid= res.jsonPath().getInt("data.id");
		 Assert.assertEquals(actid, 2,"Id Not Matched ");
		 
		 System.out.println("Id Matched ");
		 
		 //"first_name": "Janet"
		String actfname= res.jsonPath().getString("data.first_name");
		
		 //url should contains https?
		 String url=res.jsonPath().getString("support.url");
		 Assert.assertTrue(url.contains("https"));
		 System.out.println("Url matched!");
/*
 * 
 * Below is the correct way to automate the script using WHEN THEN keyword 
 * IN Cucumber Framework we have already completed this keyword 
 * 
 * 		 
 */
		 
		 //log the response in console
		  //res.then().log().headers();
		  
		  //res.then().log().body();
		  
		  //res.then().log().all();
  }
}

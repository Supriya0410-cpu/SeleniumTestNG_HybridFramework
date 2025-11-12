package Com.APIBasic;
/*
 * 
 *  Path param- Whenever any resource which is pointing to the server then its called as path param 
 * Query Parameter- filterting the path param use query parameter 
 *  e.g 
 *  https://reqres.in/api/users?page=2
 *  
 *  Base Url =https://reqres.in/api
 * Path Param= /users    ---after base url / always path param 
 * query param= ?page=2   --After question there is always query param 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T09_PathandQueryParam {
  @Test
  public void test() {
	  
	  //to pass base url 
	  RestAssured.baseURI="https://api.restful-api.dev";
	  
	Response res=  given()
			//here path is variable name you can give any name 
			//if multiple path param is avaialble then add here only below sample is the our another path param 
			//e.g .pathParam("path", "/objects/sample ") ----parh varibale storing both path param 
					.pathParam("path", "/objects")
					.queryParam("id", 3)
					.queryParam("id", 5)
					.queryParam("id", 10)
					
					//request log 
					.log().all()
					
					
					
					
					
					
	//  .when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10");
	                        //when you have not stored base url sepretaly
	// .when().get("https://api.restful-api.dev/{path}");
	                       //when you save base url sepratly 
	.when().get("/{path}");
	  
	res.then().log().body();  
	  
	Assert.assertEquals(res.getStatusCode(),200)  ;
	System.out.println("status code matched ");
	  
	  
	System.out.println("------All Ids-----");
	  //get the all ids
	List<String> allIds= res.jsonPath().getList("id");
	
	for(String i:allIds)
	{
		System.out.println(i);
	}
	  
	  
  }
}

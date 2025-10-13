package Com.APIBasic;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.restapibasicsPOJOclass.reqResPojo;
import io.restassured.response.Response;
/*
 * Import this two import statement for below technique 
 * 
 

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

 * 
 * given():Prerequisite
 * ---------------------------------
 * Request payload,header,path parameter,query parameter,Authorization
 * 
 * when():Request-endpoint
 * ------------------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then():validate
 * ---------------------------------
 * status code,status message, cookies, header, response time,response payload
 */
 
 
 
 
public class T6_JsonPayloadWay {
  @Test(priority=1)
  public void CreatePayloadusingbasic() {
	  
	  
	  System.out.println("------------Request Payload Basic Copy paste Technique------------");
	  
	Response res =  given()
					.header("x-api-key","reqres-free-v1")
					.header("Content-Type","application/json")
					.body("{\n"
					+ "    \"name\": \"Supriya\",\n"
					+ "    \"job\": \"SDET\"\n"
					+ "}"
	    		 )
					
					//endpoints of the request 
					.when().post("https://reqres.in/api/users");
	  
	//log the respponse 
	
	res.then().log().body();
	  
	//validate status code
	  Assert.assertEquals(res.getStatusCode(),201);
	  System.out.println("Status code is Matched!");
	  
	  //job=SDET
	  String job=res.jsonPath().getString("job");	 
	  Assert.assertEquals(job,"SDET");
	  System.out.println("Job matched!");
  }
  
  @Test(priority=2)
  public void testPayloadUsingHashMap()
  {
	  System.out.println("------------Request Payload HashMap Technique------------");
	  
	//Request paylaod
	  
	  HashMap<String,Object> data = new  HashMap<String,Object>();
	  data.put("name", "Supriya");
	  data.put("job", "SDET");
	  
	  
	 Response res =  given()
	  			.header("x-api-key","reqres-free-v1")
	  			.header("Content-Type","application/json")
	  			.body(data)
	  			.when().post("https://reqres.in/api/users");
	 
	 
	 res.then().log().body();
	 
	 //Validate Response 
	 
	 Assert.assertEquals(res.getStatusCode(),201);
	  System.out.println("Status code is Matched!");
	  
	  //job=SDET
	  String job=res.jsonPath().getString("job");	 
	  Assert.assertEquals(job,"SDET");
	  System.out.println("Job matched!");
	  
	  
  }
  
  @Test(priority=3)
  public void testPayloadUsingPojoClass() {
	  
	  System.out.println("------------Request Payload POJO class Technique------------");	  
	  
	  //generate request payload
	  reqResPojo obj= new reqResPojo(); //object of pojo class 
	  obj.setJob("Sanvi");
	  obj.setJob("Dev");
	  //given technique 
	  
	Response res=  given()
	  .header("x-api-key","reqres-free-v1")
		.header("Content-Type","application/json")
		.body(obj)
		.when().post("https://reqres.in/api/users");
	  
	  
	  //log response 
	  
	 res.then().log().body();
	 
	 //Validate response 
	  
		int actCode=res.getStatusCode();
	  	Assert.assertEquals(actCode,201);
	  	System.out.println("Status code match!.."+actCode);
	  	
	  //get the job from current response
	  	String actjob=res.jsonPath().getString("job");
	  	Assert.assertEquals(obj.getJob(),actjob);
	  	System.out.println("Job matched!..."+actjob);
	  
	  
	  
	  
  }
  
  
  
  public void testPayloadUsingJSONObject() {
	  
	  System.out.println("------------Request Payload JSONObject class Technique------------");
	  
	//request payload
	  JSONObject obj=new JSONObject();
	  obj.put("name","Smita");
	  obj.put("job","Dev");
	  
	  //current data is JSONObject class object we need to send right json format to server so conversion is required
	  Response res = given()
			  .header("x-api-key","reqres-free-v1")
		  		.header("Content-Type","application/json")
		  		.body(obj.toString())
		  		.when().post("https://reqres.in/api/users");
	  //log response 
	  
		 res.then().log().body();
		 
		 //Validate response 
		  
			int actCode=res.getStatusCode();
		  	Assert.assertEquals(actCode,201);
		  	System.out.println("Status code match!.."+actCode);
		  	
		  //get the job from current response
		  	String actjob=res.jsonPath().getString("job");
		  	 Assert.assertEquals(actjob,obj.get("job"));
		  	System.out.println("Job matched!..."+actjob);
		  
	  
	  
	  
  }
  
  @Test(priority=5)
  public void testPayloadUsingJsonFile() throws FileNotFoundException
  {
	  System.out.println("------------Request Payload JsonFile Technique------------");
	  
	  //request payload
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//JsonFiles//Reqres.json");
	  
	  //file read
	  FileReader fr=new FileReader(f1);
	  
	  //To convert file character data into Json : JSONTokener class
	  JSONTokener token=new JSONTokener(fr);
	  
	  //to structure it into jsonObject: JSONObjectClass
	  JSONObject obj=new JSONObject(token);
	  	  
	  Response res=given()
			  	.header("x-api-key","reqres-free-v1")
			  		.header("Content-Type","application/json")
			  		.body(obj.toString())//current data is JSONObject so that is reason converion requried 
			  		.when().post("https://reqres.in/api/users");
	  
	  //log the response
	  res.then().log().body();
	  
	//status code
	  	int actCode=res.getStatusCode();
	  	Assert.assertEquals(actCode,201);
	  	System.out.println("Status code match!.."+actCode);
	  	
	  //get the job from current response
	  	String actjob=res.jsonPath().getString("job");
	  Assert.assertEquals(actjob,"SDET");
	  	System.out.println("Job matched!..."+actjob);
	  
	  
	  
  }

 

 
}

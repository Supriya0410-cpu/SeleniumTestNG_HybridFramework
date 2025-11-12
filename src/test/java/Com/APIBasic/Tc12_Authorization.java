/*
 * Authentication :- just check user validationn

Authorization :- authentication + access check 
 * Auth req points = 1] no auth 2] Apy key 3] bearear token 3] basic auth 4] digest Auth 5] O-auth 1.0  6] O-Auth 2.0
 * 
 * O-Auth = 3rd party application used o-auth
 * 
 * 1]Basic Auth = sending verified username and password with your request --  //basic Auth: Base64 algorithm
 * 2]Digest Auth = same for the basic but internally use diff alogrithm MD5 & SHA alogorithm
 * 3]Berear Token = its like a authorization key -This token you will get into the one of req save this token into variable and use otherwise copy the token and choose beareaer token in autherization part and paste the token
 * 
 * Manual Way to save token:-
 *  script for save token 
 *  let token = pm.response.json("token")// this is name of json vairable token 
 *  pm.enviroment.set("tokenlogin",token);
 *  
 *  check in env varibale your token created or not 
 *  and use this varibale in authorization part in bearer token password section
 *  
 *  4] Open Authrization :- 0 Auth 1.0 and and O auth 2.0 
 *  
 *  both are protocol 
 *  1.0 - depricated 
 *  1.0 - more complex ..crepotogrphic technique used 
 *  1.0 - access tokens 
 *  1.0 - not refresh token technique
 *  
 *  2.0 - simple to implement (TSL use technique transport secure layer ]
 *  2.0 - Beareaker token 
 *  2.0 - refresh token technique available 
 *  
 *  O-AUTH 2.0is an Authorization framework 
 *  limited access for 3rd party application 
 *  
 *  Explain 1.0 Auth :-
 *  
 *  if we want to access the likdln then we need to sign in or we got option login throuth the google account 
 *  that means when we sign in server sent to the tempory token then user request to the application again for request callback url then token willl exchange and we get access token then aprrove request of token  and we are able to lgin this token 
 *  this all process is authtentication techniques
 *  
 *  Explain 1.0 Auth :-
 *  user sent the authoeization request if req granted then user get access token or req token using that token user able to login the application 
 */
package Com.APIBasic;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Tc12_Authorization {
	
	
	 String loginToken;
  @Test(priority=1)
  public void BasicAuthTest() {
	  System.out.println("--------Basic Authentication-------------");
	  //basic Auth: Base64 algorithm
	  
	  Response res=given()
			  .auth().basic("postman","password")
	  
	  .when().get("https://postman-echo.com/basic-auth");
	  
	  
	  
	  res.then().log().all();
	//assertion
	  Assert.assertEquals(res.getStatusCode(),200);
	  
	  //json validation
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  Assert.assertEquals(status,true);
  }
  
  
  
  @Test(priority=2)
  public void DigestAuthtest() {
	  
	  System.out.println("--------Digest Authentication(MD5/SHA)-------------");
	  Response res = given()
			  .auth().digest("postman", "password")
			      
			  
			        .when().get("https://postman-echo.com/digest-auth");
	  
	  
	  res.then().log().body();
	  
	//assertion
	  Assert.assertEquals(res.getStatusCode(),200);
	  
	  //json validation
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  Assert.assertEquals(status,true);
	  
  }
  
  
  
  @Test(priority=3)
  
  public void genertteBareaertoken()
  {
	  System.out.println("---------------Use case for Generate Bearer Token---------");
	  
	  //request payload technique 
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("email","test4567@gmail.com");
	  map.put("password","baramati123");
	  
	  
	  Response res=given()
			  
			  .header("Content-Type","application/json")
	  			.body(map)
		  			.when().post("https://thinking-tester-contact-list.herokuapp.com/users/login");
	  
	  
	  
	  res.then().log().body();
	  
	  
	  //to get the token
	  
	   loginToken=res.jsonPath().getString("token");
	  
	  System.out.println("Token generated!: "+loginToken);
  }
  
  
  
  
  @Test(priority=4)
  public void useBearerToken()
  {
	  
	  System.out.println("---------------Use case for Bearer Token---------");
	  Response res=given()
			  			.header("Authorization","Bearer "+loginToken) //here check the in postman check space as well write as it is 
			  			.when().post("https://thinking-tester-contact-list.herokuapp.com/users/logout");
	  
	  
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("User logout is completed!");
  }
  
  
  @Test
  public void testOauth2()

  {
	  Response res=given()
			  			.auth().oauth2("access token ")
			  			.when().get("https://api.github.com/user/repos");
	  
	  res.then().log().body();
	  
	  
  }
  
}

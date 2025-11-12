package Com.APIBasic;
/*Cookie:-
Cookies are small file of information that web servers generates and sends to a web browser.
Cookies help inform websites about the user  and enabling the website to personalize the user experience.
Every req sperate cookie /  cokkie not same validation 
 * 
 * Header:-
A Response header is an HTTP header that can be used in an HTTP response.
HTTP Headers used to pass additional information between the client and server.


Script for Cookie validation :- https://www.google.com/ --real time application 

//TO TEST COOKIES : UPDATES EVEYTIMR
pm.test("test cookies AEC prsenr",()=>{
pm.expect(pm.response.cookies.has("AEC"))

});











 */
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Tc10_CookiesHeaderValidation {
  @Test(priority=1)
  public void test() {
	  
	  
	  
	 Response res= given()
	  
	  
	  
	  .when().get("https://www.google.com/");
	
	 //get all cookies in console 
	res.then().log().cookies();  
	  
	  
	  //get the value of single cookie
	String ACTcookie=res.getCookie("AEC");
	System.out.println("cookie value is "+ACTcookie);
	  
	  
	  /*
	   * validation
	   * 
	   * Two cookies value should not be same
	   * 
	   * As Every time we send request to the server, server generate new cookie 
	   */
	  
	
	String ActVal="AaJma5vqXgIw1YZQb-xM7VECg1ecnqxiADlTfde9OinHQmZUKoozenw0Jgk";
	  
	  
Assert.assertFalse(ACTcookie.contains(ActVal),"Cookie matched test fail ")	  ;
	  
	  System.out.println("Test Pass when two cookie not same ");
	  
	  
	  Assert.assertTrue(!ACTcookie.contains(ActVal),"Cookie  matched test fail ")	  ; 
	  
	  System.out.println("Test Pass when two cookie not same ");
	  
	  
	  
	  
  }
  
  
  @Test(priority=2)
  public void testheader()
  {
	  Response res= given()
			  
			  
			  
			  .when().get("https://www.google.com/");  
	  
	  
	  
	//get all header 
	  
	  res.then().log().headers();
	  
	  //get the header value 
	String header=res.getHeader("Content-Type");
	  
	System.out.println("Header value is "+header);  
	  
	 //validation
	  String exp="text/html; charset=ISO-8859-1";
	  
	  
	  Assert.assertTrue(header.contains(exp), "Header not matched ");
	  System.out.println("Header value matched ");
	  
	  
	  
	  
  }
  
  
  
  
  @Test(priority=3)
  
  public void logres()
  {
 Response res= given()
			  //request log 
		      .log().all()
			  
			  
			  .when().get("https://www.google.com/");  
	  
 //response log  methods 
 
 res.then().log().headers();
 res.then().log().cookies();
 res.then().log().body();
 res.then().log().all();
 
 
 
  }
  
  
  
}

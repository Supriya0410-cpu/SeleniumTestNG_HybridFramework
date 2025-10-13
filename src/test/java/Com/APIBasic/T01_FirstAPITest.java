package Com.APIBasic;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T01_FirstAPITest {


	/*
	 * RestAssured is class through which we can pass request to server
	 * 
	 * Response is interface in RestAssured framework
	 */

	@Test
	public void testsingleuser() {

		Response res=  RestAssured.given().header("\"x-api-key","reqres-free-v1").get("https://reqres.in/api/users/2");

		System.out.println("status code is :"+res.getStatusCode());
		System.out.println("status line is :"+res.getStatusLine());


		System.out.println("Response time is: "+res.getTimeIn(TimeUnit.MILLISECONDS));

		System.out.println("------Raw type(String) body-----");

		System.out.println("Raw data is :"+ res.asString());


		System.out.println("------JSON response  body-----");

		System.out.println("JSON Format boday:"+res.asPrettyString());


		System.out.println("Content Type is :"+res.getContentType());


	}



}

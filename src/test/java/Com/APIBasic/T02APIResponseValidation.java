package Com.APIBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T02APIResponseValidation {
	@Test
	public void testResponse() {

		RestAssured.baseURI="https://reqres.in";

		Response res=  RestAssured.given().header("x-api-key","reqres-free-v1").get("/api/users/2");


		//validate status code 

		int actresponse=  res.getStatusCode();
		Assert.assertEquals(actresponse, 200,"Status code not matched ");

		System.out.println("Status code matched ");


		//status message -OK

		String actMsg=	res.getStatusLine();
		Assert.assertTrue(actMsg.contains("OK"),"Status message not matched ");
		System.out.println("Status message matched ");


		//test header

		String actContent=   res.getContentType();

		Assert.assertTrue(actContent.contains("application"),"Hear not matched ");

		System.out.println("Header matched ");


	}
}

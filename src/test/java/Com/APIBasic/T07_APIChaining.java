package Com.APIBasic;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.restapibasicsPOJOclass.Authpojo;
import Com.restapibasicsPOJOclass.Bookingdatespojo;
import Com.restapibasicsPOJOclass.PartailBooking;
import Com.restapibasicsPOJOclass.bookingpojo;
import io.restassured.response.Response;
 
public class T07_APIChaining {
	
	
	  public   int bookingId;
	  public String tokenValue;
	  
  @Test(priority=1)
  public void createnewBooking() {
	  
	
	  
	  System.out.println("----------Create new Booking------------");
	  //Request payload
	  
	  Bookingdatespojo p= new Bookingdatespojo();
	  p.setCheckin("2025-10-14");
	  p.setCheckout("2025-10-15");
	 
	  // Here follw the actaul sequence number of payload if nested is avaiale then aslo follw the seq 
	  bookingpojo p2 = new bookingpojo();
	  p2.setFirstname("Bhayga");
	  p2.setLastname("dadhe");
	  p2.setTotalprice(555);
	  p2.setDepositpaid(true);
	  p2.setBookingdates(p);
	  p2.setAdditionalneeds("Lunch");
	  
	  
	  
	  //sent the request 
	  
	  Response res=given()
		  		.header("Content-Type","application/json")
		  		.body(p2)

		  		.when().post("https://restful-booker.herokuapp.com/booking");
	  
	  //log response 
	  
	  res.then().log().body();
	  
	  
	  //validation 
	  
	  //status code should be 200
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code is Matched!..."+res.getStatusCode());
	  
	  //get the booking id and store it into variable
	  
	  bookingId=res.jsonPath().getInt("bookingid");
	  System.out.println("New booking created with id: "+bookingId);
	  
	  
	  
  }
  
  @Test(priority=2)
  public void getbookingid()
  {
	  //here just need to sent the req with using booking id variable 
	  System.out.println("----------Get the deatils of new Booking------------");
	  
	  //request payload 
	  Response res=given()
			       .when().get("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //log the response 
	  
	  res.then().log().body();
	  
	  //Assert for status code
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched!.."+res.getStatusCode());
	  

	  System.out.println("Booking deatils for id:"+bookingId);
	  
	  
	  
	 
  }
  
  @Test(priority=3)
  public void createToken()
  {
	  System.out.println("----------Generating new Token------------");

	  //request payload
	  Authpojo data=new Authpojo();
	  data.setUsername("admin");
	  data.setPassword("password123");
	  
	 Response res= given()
			 		.header("Content-Type","application/json")
			 		.body(data)
	  	
			 			.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  //log the response
	 res.then().log().body();
	 
	 //get the token store it and reuse
	 tokenValue=res.jsonPath().getString("token");
	 System.out.println("New Token generated: "+tokenValue);
	 
  }
  
  @Test(priority=4)
  public void fullUpdateBooking()
  {
	  System.out.println("----------Updating booking for same id with token------------");
	  //Request payload
	  Bookingdatespojo dates=new Bookingdatespojo();
	  dates.setCheckin("2025-10-16");
	  dates.setCheckout("2025-10-17");
	  
	  
	  bookingpojo data=new bookingpojo();
	  data.setFirstname("sai");
	  data.setLastname("ram");
	  data.setTotalprice(998);
	  data.setDepositpaid(true);
	  data.setBookingdates(dates);
	  data.setAdditionalneeds("dinner");
	  
	  Response res=given()
			  			.header("Content-Type","application/json")
			  				.header("Accept","application/json")
			  					.header("Cookie","token="+tokenValue)
			  						.body(data)
	  
			  							.when().put("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //log the response
	  res.then().log().body();
	  
	  //Assertion for status code
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched!..."+res.getStatusCode());
	  
	  //firstname should be Amit
	  String fname=res.jsonPath().getString("firstname");
	  Assert.assertEquals(fname,"sai");
	  System.out.println("First name matched!");
	 
	  
  }
  
  
  @Test(priority=5)
  public void partialBookingUpdate()
  {
	  System.out.println("----------Updating Partail booking for same id with token------------");

//	  BookingPojo data=new BookingPojo();
//	  data.setFirstname("samiksha");
//	  data.setLastname("Sane");//properties will become null so can't read
	  
	  PartailBooking data=new PartailBooking();
	  data.setFirstname("samiksha");
	  data.setLastname("Sane");
	  
	  Response res=given()
			  			.header("Content-Type","application/json")
			  					.header("Accept","application/json")
			  						.header("Cookie","token="+tokenValue)
			  						 .body(data)
					
			  							.when().patch("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //log the response 
	  res.then().log().body();
  }
  
  
  @Test(priority=6)
  public void deleteSameBooking()
  {
	  System.out.println("----------Deleting new created booking------------");

	 Response res= given()
			 	.header("Content-Type","applcation/json")
	  			.header("Cookie","token="+tokenValue)
	  			.when().delete("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	 //assert status code
	 Assert.assertEquals(res.getStatusCode(),201);
	 System.out.println("Booking deleted!");
  }
  
  
  
  

  
}

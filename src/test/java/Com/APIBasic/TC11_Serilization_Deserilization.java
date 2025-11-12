package Com.APIBasic;
import org.testng.Assert;
/*
 * We are not able to share our data as it is to the server we need to convert json or xml format 
 * serilization-
 * data conver into the json or xml for server understanding [encrpytion ]
 * object convert into json[byte stream] 
 * 
 * 
 * 
 * deserlization-
 * json[ByteStream] convert again back to object 
 * 
 * Using object mapper class to convert 
 */
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Com.restapibasicsPOJOclass.Authpojo;

public class TC11_Serilization_Deserilization {
  @Test
  public void test1() throws JsonProcessingException {
	  
	  
 //Java Object(POJO) into JSON
	  
	  Authpojo auth=new Authpojo();
	  auth.setUsername("Supriya");
	  auth.setPassword("test123");
	  
	  
	  ObjectMapper obj= new ObjectMapper();
	  
	  
	  
	  //serilization java object to the the json[byte stream]
	  
 String jsonObj=obj.writerWithDefaultPrettyPrinter().writeValueAsString(auth);//which obj need to convert i want auth that is reaon ui use auth
	  
	  System.out.println(jsonObj);
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  @Test
  public void deserlization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String jsondata="{\n"
		  		+ "  \"username\" : \"Supriya\",\n"
		  		+ "  \"password\" : \"test123\"\n"
		  		+ "}";
	  
	  
	  
	//convert json into pojo
	  ObjectMapper obj=new ObjectMapper();
	  
	  Authpojo authobj=obj.readValue(jsondata,Authpojo.class);
	  
	  //validation
	  String name=authobj.getUsername();
	  Assert.assertEquals(name,"Supriya");
	  System.out.println("User name matched!");
	  
	  
	  
	  
	  
			  
  }
}

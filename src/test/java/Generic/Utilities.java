package Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public static void selectdropdownlistoption( WebElement ele , String Actual) throws InterruptedException {
		
	

	Select d1= new Select(ele);
	
	System.out.println(" check whetehr the lis able to select multiple element : "+d1.isMultiple());
	
	Thread.sleep(200);

	//select the list option using visible text 
	
	d1.selectByVisibleText("Appliances");
	
	Thread.sleep(200);
	 
	// select by the value attribute 
	
	d1.selectByValue("search-alias=apparel");
	
	// to retrive all list 
	
	String Actal="Jewellery";
	
	List <WebElement> ele2=d1.getOptions();
	System.out.println("all list count :"+ ele2.size());
	
	for(WebElement i:ele2)
	{
	 System.out.println(i.getText());
		
	 if(i.getText().contains(Actal)) {
		 
		i.click();
		break;
	 }
	}
	
	
	}	
	
}

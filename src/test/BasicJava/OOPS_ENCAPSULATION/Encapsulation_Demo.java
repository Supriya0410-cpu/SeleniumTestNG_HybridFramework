package OOPS_ENCAPSULATION;
/*
 *Defination - Wrapping of DATA and MEMBER FUNCTION into single unit
 *Purpose- Data Hiding / Security 
 *Example-CAPSUL / CLASS / MOBILE PHONE 
 *Implimation or How to acchive -
 *Declare the class variable as a private and access it through public methods
 *1. setter()= for set the value
 *2. getter()=for get the vale / return value 
 * 
 * THIS IS MAINLY USED IN POM DESIGN PATTEN IN SELENIUM FRAMEWORK
 * 
 * 
 * 
 * 
*/




class employeedata
{
	private int id=10;
	 private String name="pooja";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}


public class Encapsulation_Demo {

	public static void main(String[] args) {

		employeedata e1 = new employeedata();
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		System.out.println("******************NEW DATA************************************************************");
		
	e1.setId(22);
	e1.setName("pritsss");	
		
      System.out.println(e1.getId());
      System.out.println(e1.getName());
	}

}

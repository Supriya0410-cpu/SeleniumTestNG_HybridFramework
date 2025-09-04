package OOPS_DataAbstraction;
/*
 * In a child class add Unimplemented methods in abstract class
 * 
 * 
 * 
 * 
 * 
 */
public class ChildAbstarction extends DemoAbstaction {

	public void details()
	{
		System.out.println("Details...........child class");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	public static void main(String[] args) {
		ChildAbstarction c1= new ChildAbstarction();
		c1.display();//inherited
		c1.show();//inherited
		c1.details();//individual 
	}

	

}

package OOPS_INHERITANCE;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1= new Car();// Parent Class 
		Nexon n1 = new Nexon();// Child class
		KIA k1 = new KIA();// Child class
		
		System.out.println("***********************************************************************");
		System.out.println("Scenario 1:- Child class reference : Child class object -> parent+ child class method ");
		
		c1.vechiletype();// parent class of the car vechile
		
			k1.CarEngin();
			k1.KiaEngin();
			
			n1.CarEngin();
			n1.NexonEngin();
		
		
		System.out.println("***********************************************************************");
		
		System.out.println("Scenario 2:- Parent class referce paraent clas object->only parent class methods ");
		
			Vechile v1= new Vechile();
			v1.vechiletype();
		
			c1.CarEngin();
		
		System.out.println("***********************************************************************");
		System.out.println("Scenario 3:- Parent class ref and child class object =>only parent class method s");
			
			Car c2 =new Nexon();
			c2.CarEngin();
			
			Vechile v2= new Car();
			v2.vechiletype();// only parent class methods get 
			
		System.out.println("***********************************************************************");
		System.out.println("[Invalid In JAVA]Scenario 4:-Child class reference and paraent class object->Invalid type mistmatch error");
		
	//		KIA k2= new Car();
		
	}

}

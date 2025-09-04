
public class ConstructorThisKeyworddemo3 {

	
	
	public ConstructorThisKeyworddemo3()
	{
		this(1);
		System.out.println("This is an a default Constructor");
	}
	
	public ConstructorThisKeyworddemo3(int id) {
		
		
		this(16,1);
		System.out.println("This is an parameterized constructor with single param");
	}
	
	public ConstructorThisKeyworddemo3(int age , int rollno) {
		
		System.out.println("this is an a paramaterized constructor with 2 param");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorThisKeyworddemo3 ob=new ConstructorThisKeyworddemo3();
		
	}

}

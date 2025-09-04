
public class Constructor {

	int a;         //Instance Variable 
	int b;         //Instance Variable
	public Constructor()
	{
		System.out.println("This is an a default constructor ");
	}
	
	public Constructor(int a1 , int b1 )   //Local Variable 
	
	{
		System.out.println("This is an a Parameterize  constructor ");
		
		//Instance Variable assign to the local variable
		int a=a1;
		int b=b1;
		
		System.out.println("value of A "+a);
		System.out.println("value of B "+b);
	}
	
	public static void main(String[] args) {
	
		Constructor c1 = new Constructor();
		Constructor c2= new Constructor(10,20);
		
		
		
		
		
		
	}

}

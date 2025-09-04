package OOPS_Polymorphism;

public class ConstructorOverloading {

	
	
	public ConstructorOverloading()
	{
		System.out.println("This is default constructor");
	}
	
	public ConstructorOverloading(int id)
	{
		System.out.println("This is parametrize  constructor pass the parameter:"+id);
	}
	
	public ConstructorOverloading(int id , String data)
	{
		System.out.println("This is parametrize  constructor pass the parameter:"+id +data);
	}
	
	
	
	public static void main(String[] args) {

		ConstructorOverloading a1=new ConstructorOverloading(55);
		
		ConstructorOverloading a2=new ConstructorOverloading(88,"supriya");
		

	}

}

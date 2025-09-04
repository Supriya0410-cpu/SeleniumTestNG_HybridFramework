package OOPS_Polymorphism;

public class Polymorphism_Demo {

	public void add()
	{
		System.out.println("Addtion started");
	}
	
	public void add(int a , int b)
	{
		System.out.println("Addtion of two numbers is :"+(a+b));
	}
	
	public void add(double a, int b ) {
		System.out.println("Addtion of a and b is:"+(a+b));
	}
	public void add(int a , int b , int c) {
		System.out.println("addtion of ab c is :"+(a+b+c));
	}
	public static void main(String[] args) {
		
		Polymorphism_Demo p1 = new Polymorphism_Demo();
		p1.add();
		p1.add(5, 4);
		p1.add(2322.5, 678);
		p1.add(4,6, 12);
		
			}

}

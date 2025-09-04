import java.util.Scanner;

public class ReturnKeywordandUserInput {

	
	
	public int add(int a , int b)
	{
		int c=a+b;
		return c;
	}
	
	
	public int sub(int a , int b)
	{
		int c=a-b;
		return c;
	}
	
	
	public int mul(int a , int b)
	{
		int c=a*b;
		return c;
	}
	
	
	public int div(int a , int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		ReturnKeywordandUserInput r1 = new ReturnKeywordandUserInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		System.out.println("Addtion:"+r1.add(n1, n2));
		System.out.println("Substraction:"+r1.sub(n1, n2));
		System.out.println("Multipication:"+r1.mul(n1, n2));
		System.out.println("Division:"+r1.div(n1, n2));
	}

}

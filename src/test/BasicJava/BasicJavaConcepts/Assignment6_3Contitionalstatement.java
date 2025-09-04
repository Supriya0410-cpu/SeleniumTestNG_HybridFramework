package BasicJavaConcepts;
import java.util.Scanner;

public class Assignment6_3Contitionalstatement {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Four number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		if(num1>num2 && num1>num3 && num1>num4) {
			System.out.println(num1+"is an greather number");
		}
		
		else if(num2>num1 && num2>num3 && num2>num4) {
        	System.out.println(num2+"is grater number");
        }
        
		else  if(num3>num1 && num3>num2 && num3>num4)
        {
        	System.out.println(num3+"is a greater");
        }
        
        else {
        	System.out.println(num4+"is a grater");
        }
	}

}

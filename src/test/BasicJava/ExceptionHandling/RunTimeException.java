package ExceptionHandling;

import java.util.Scanner;

public class RunTimeException {

	public static void main(String[] args) {
		
		
		System.out.println("***************Aithmetic Exception Example***********************");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two number");
		
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	System.out.println("Addtion is :"+(n1+n2));
	System.out.println("Subscraction  is :"+ (n1-n2));
	try {
	System.out.println("Division is :"+(n1/n2));
	}
	
	catch(Exception e) {
		System.out.println("Enter valid number 0 not allowed");
	}
	System.out.println("Multipication is :"+(n1*n2));
	
	
	
	System.out.println("*******************ArrayIndexoutofbounds Exception*********************");
	
         int arr[]={0,20,30,40,50};
         
         Scanner sc1 = new Scanner(System.in);
         System.out.println("Enter the number betwwen 0 to 4 ");
       int index=sc1.nextInt();
       
       try {
    	   System.out.println(arr[index]);
       }
       
   	catch(Exception e) {
		System.out.println("Enter valid number in betwwen index 0 to 4");
	}
	
	System.out.println("*****************NullPointerException****************************");
       
     //  Scanner sc2= new Scanner(System.in);
    // int num1=sc2.nextInt();
    int num3=10;
    System.out.println(num3);
    try {
    	 int num4=(Integer) null;
    	 System.out.println(num4);
    }
	catch(Exception e) {
		System.out.println("Enter valid number null  not allowed");
	}
	}

}

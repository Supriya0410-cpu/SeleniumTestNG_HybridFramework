import java.util.Scanner;

public class Assignment8_Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number");
		
		int num1=sc.nextInt();
		int fact=1;
		
	    for(int i=num1;i>=1;i--) {
	    	
	    	fact=fact*i;
	    	
	    }
		
     System.out.println("factorial of the num"+fact);
     
 	
     System.out.println("************************************************************************");
     //REVESE the given number 
     
 	System.out.println("Please Enter the Number");
 	  int num=sc.nextInt();
     int rem;
     int sum=0;
   
     while(num!=0)
     {
    	 rem=num%10;       // Always get last number as remainder that is why we use 
    	 num=num/10;       // This will get remain number that means quotiant 
    	 sum=sum*10+rem;  
     }
     System.out.println(sum);
     
     if (num==sum) {
    	 
    	 System.out.println("Palendrome");
    	 
     }
     else
     {
    	 System.out.println("not pla");
     }
	
	
	
	   System.out.println("************************************************************************");
	     //Sum the given number 
	     
	 	System.out.println("Please Enter the Number");
	 	  int num2=sc.nextInt();
	     int rem1;
	     int sum1=0;
	   
	     while(num2!=0)
	     {
	    	 rem1=num2%10;       // Always get last number as remainder that is why we use 
	    	 num2=num2/10;       // This will get remain number that means quotiant 
	    	 sum1=sum1+rem1;  
	     }
	     System.out.println(sum1);
		}


	
}
	



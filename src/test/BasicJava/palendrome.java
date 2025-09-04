import java.util.Scanner;

public class palendrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("************************************************************************");
		     //REVESE the given number 
		     
		 	System.out.println("Please Enter the Number");
		 	  int num=sc.nextInt();
		 	  int org=num;
		     int rem;
		     int sum=0;
		   
		     while(num!=0)
		     {
		    	 rem=num%10;       // Always get last number as remainder that is why we use 
		    	 num=num/10;       // This will get remain number that means quotiant 
		    	 sum=sum*10+rem;  
		     }
		     System.out.println(sum);
			
	
	if(org==sum) {
		
		System.out.println("given num is palendrome");
	}
	else
	{
		System.out.println("given num is not palendrome");
	}
	

	}
}

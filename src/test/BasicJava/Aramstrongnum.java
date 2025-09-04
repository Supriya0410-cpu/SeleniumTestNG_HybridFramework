import java.util.Scanner;

public class Aramstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("************************************************************************");
		     //REVESE the given number 
		     
		 	System.out.println("Please Enter the Number");
		 	  int num=sc.nextInt();
		 	 // int org=num;
		     int rem;
		     int sum=0;
		   
		     while(num!=0)
		     {
		    	 rem=num%10;       // Always get last number as remainder that is why we use 
		    	 num=num/10;       // This will get remain number that means quotiant 
		    	 sum=sum+rem*rem*rem;  
		     }
		     System.out.println(sum);
	}

}

package Array_String;

/*
 *   for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
   1 
   1 2
   1 2 3

*/

public class PatternMatching {

	public static void main(String[] args) {
		for(int r=1;r<=3;r++)
		{	
			for (int c=1;c<=r;c++)
			{
				System.out.print(c);
				//System.out.print(r);
				
			}
			
			System.out.println("   ");
		}	
	

/*	
	
	1 
	2 2
	3 3 3
	
*/	
	
	
	for(int r=1;r<=3;r--)
	{
		for(int c=1;r<=r;c++) {
			
			if(r==c) {
				
			System.out.print(c);
			//System.out.println(r);
		}
		}
		
		System.out.println();
		
	}
	
	
	
	
	}
	
}
























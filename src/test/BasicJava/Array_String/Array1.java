package Array_String;

public class Array1 {

	public static void main(String[] args) {
		
		System.out.println("************************Single diamensional Array**************************************************************************");
		
		int i[]={10, 20 , 30 ,40,50};
		
		for(int val:i)
		{
			System.out.print(val);
		}
		System.out.println();
		
		
		
		System.out.println("************************Mutli- diamensional Array**************************************************************************");
		
		int A[][]= {{ 10 ,100},{20,200},{30,300}};
		 System.out.println("size of array"+A.length);
		 
		 System.out.println("indes 2 element"+A[0][1]);
		
		for(int res[]:A) {
		
			for(int j:res)
			{
				
		
		System.out.print(j);
		
		}
		System.out.println();
		
		}
		
	}

}

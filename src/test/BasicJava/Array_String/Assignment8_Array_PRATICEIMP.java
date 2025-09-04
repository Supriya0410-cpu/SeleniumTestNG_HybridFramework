package Array_String;


//WAP Accept the username and password and skip the header part  and print the vales 
//username   password 
//admin       admin123
//kiran       ki123
//ram         ram123
//sham        s1234



public class Assignment8_Array_PRATICEIMP {

	public static void main(String[] args) {
	
		
		Object Obj[][]= {{ "user", "password"},{ "admin" , "admoin123"},{ "kiran" ,"ki123"},{"ram", "ram123"},{"sham" ,"s1234"}};
		
		for(int i=1;i<=Obj.length;i++)  {
			
			for(int j=0;j<Obj[i].length;j++) {
				
				System.out.print(Obj[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}

/*

 Constructor main use to assign value of instance varibale 
  Constructor is same name of class name 
  Constructor does not have return type 

*/
public class ParamaeterrizeConstructor {

	int Age;  // Instance Variable
	String Name; // Instance Variable 
	
   public ParamaeterrizeConstructor(String name , int age)
	
   {
	   Age=age;  // Local Variable
	   Name=name; // Local Variable
   }
	
   public void show()
   {
	   System.out.println("name of person:"+Name);
	   System.out.println("Age of person:"+Age);
   }
	
	
	
	public static void main(String[] args) {
	
		
		ParamaeterrizeConstructor c1= new ParamaeterrizeConstructor("supriya",25);
                  c1.show();
	}

}

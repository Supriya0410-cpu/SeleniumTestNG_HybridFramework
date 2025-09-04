package Array_String;

public class StringMethods {

	public static void main(String[] args) {

		
		String s1= "Hello World";
		
		System.out.println("Length of string "+s1.length());
		System.out.println("Index of char O is "+s1.indexOf("o", 2));
		
		System.out.println("Make string upper case"+s1.toUpperCase());
		
		System.out.println("Lower case"+s1.toLowerCase());
		
		System.out.println(""+s1.trim());// Trim removes only the starting and ending spaces not midddle spaces 
		
		System.out.println(s1.substring(0, 5));
		
		
		System.out.println(s1.replace("H"," h"));
		System.out.println(s1.isEmpty());//Return true if length is 0
		System.out.println(s1.isBlank());//Return true if str is empty or white spaces otherwise faslse
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.endsWith("ld"));
		
	}
	

}

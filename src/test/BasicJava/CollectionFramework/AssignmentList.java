package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*Assignment 1 :- In given array list remove the dupliate element using a linkedhashset
 * 
 *Assignment2:- In given string remove the dupliate elements;
 *
 * 
 * 
 */
public class AssignmentList {

	public static void main(String[] args) {

		ArrayList<Object> a1= new ArrayList<Object>();

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(20);
		a1.add(10);


		System.out.println("Array elements ");
		System.out.println(a1);



		LinkedHashSet<Object> h1= new LinkedHashSet<Object>(a1);

		System.out.println("Sorted array list elements are" );

		System.out.println(h1);

		System.out.println("*******************************************************************************************");
	
	String s1="aabbccdde";

	for(char s:s1.toCharArray())
	{
		System.out.println(s);
	}

		LinkedHashSet<Object> h2= new LinkedHashSet<Object>();

		System.out.println("Sorted array list elements are" );

	for(Object s2: h2) {
		
		
	}
	
	}




}

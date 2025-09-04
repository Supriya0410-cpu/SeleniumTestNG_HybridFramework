package CollectionFramework;

import java.util.ArrayList;

/*
 * ArrayList is growable.. Dynamic size in Nature
 * ArrayList default first size is 10 
 * Arraylist allow element any element search by using index position
 * By using Arraylist we can add or remove element any time 
 * Disadvantage :-
 * Manuplation is slow beacuse when we add or remove element lot of shiffting requried
 * Main use:-
 * Iteration and the retrive the information
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
	ArrayList<Object> a1= new ArrayList();
	
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	
	a1.add(2, "s");
	//Return bollean result
System.out.println("Check list emplty or not "+a1.isEmpty());
	
	//retun the element at 2nd index
  System.out.println("second index of element"+a1.get(2));
	
  //removed the 4th index of elemenet
 System.out.println(a1.remove(4));
		
		System.out.println("addes new elemeny 60");
		a1.add(60);
		
		
		
		System.out.println(a1);
		
		System.out.println("index of 60 is a "+a1.lastIndexOf(60));
		
		for(Object i: a1)
		{
			System.out.println(i);
		}
		
		
		
	//for equlas method need same datatype and same type of array list 
		
		ArrayList<Object> a2= new ArrayList();
		a2.add("a");
		a2.add("b");
		
		ArrayList<Object> a3= new ArrayList();
		a3.add("c");
		a3.add("d");
		
		
		System.out.println("Equals method check "+a2.equals(a3));

	}

}

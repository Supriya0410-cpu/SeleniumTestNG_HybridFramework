package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<Object> l1 = new LinkedList<Object>();
		
		if(l1.isEmpty())
			
		{
			l1.add("Supriya");
			l1.add("Sul");
			l1.add(04);
			l1.add("Amdocs");
			l1.add("344.00");
		}
		
		
		
		
		System.out.println("*********************Collection class****************");
		
		LinkedList<Integer> l2= new LinkedList<Integer>();
		
		l2.add(10);
		
		l2.add(20);
		
		Collections.sort(l2);
		
		
		
		
		
		System.out.println("Check list empty or not "+l1.isEmpty());
		System.out.println(l1);
	
		l1.addFirst("Biodata");
		l1.addLast("End");
		
		System.out.println(l1);
		
		System.out.println("Element of 4th position"+l1.get(4));
		
	System.out.println("Remove 2nd index of elemenyt"+l1.remove(2));
	
	System.out.println(l1);
	
	System.out.println("****************Iteration for each loop****************");
			
			for(Object i:l1)
			{
				System.out.println(i);
			}
		
			
			
		System.out.println("**********************iteator class**********");	
		
		Iterator<Object> ir=l1.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("************ListIterator class*************************");	
		
	ListIterator<Object> ir1=l1.listIterator();
	
	while(ir1.hasNext())
	{
		
		System.out.println(ir1.next());
	}
	System.out.println("**************************Reverse order*************************");
	while(ir1.hasPrevious())
	{
		System.out.println(ir1.previous());
	}
	
	System.out.println("**********************Collection Class**************************************");
	
	
	
	/*ArrayList<Object> a1= new ArrayList<Object>();
	 a1.add(10);
	 a1.add(20);
	 
	 a1.add(30);
	System.out.println(a1);
	*/
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

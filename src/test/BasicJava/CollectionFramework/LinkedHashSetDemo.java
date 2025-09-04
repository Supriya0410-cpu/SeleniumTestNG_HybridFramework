package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		
		LinkedHashSet<Object> h1 = new LinkedHashSet<Object>();
		
		h1.isEmpty();
		{
			
			h1.add("supriya");
			h1.add("sul");
			h1.add("01");
		}
		
		
	System.out.println("size of a linked hash set is "+h1.size());
	
	System.out.println("to check if element present or not "+h1.contains(01));
	
	h1.addFirst("Biodata");
	h1.addLast("end");
	
	System.out.println(h1);
		
	System.out.println("******************Iteatortion using for each loop ********************");
		
		
	for(Object i:h1)	{
		
		System.out.println(i);
	}
		
		System.out.println("**************iteatoration using the list iterator***********************");
		
	/*ListIterator<Object> l1=(ListIterator<Object>) h1.iterator();
	{	
		
		System.out.println(l1);
		
		
		
	}*/
		
		
		
		
		
	}

}

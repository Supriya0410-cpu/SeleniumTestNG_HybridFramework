package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		
		ArrayList<Object> l1= new ArrayList();
		
		System.out.println("Check list empty or not ");
	if(l1.isEmpty())
	{
		
	
	
		l1.add("sanvi");
		l1.add("123");
		l1.add("solapur");
		l1.add("88.99");
	}	

	else
	{
		System.out.println("List have alreday elements ");
	}
	
	System.out.println(l1);
	


	
	System.out.println("*********************************************************************************************************************** ");
	
	System.out.println("Add two list or merge the two list");
	
	
	ArrayList<Object> l2= new ArrayList();
	l2.add(10);
	l2.add(20);
	System.out.println(l2);
	ArrayList<Object> l3= new ArrayList(l2);
	l3.add(30);
	l3.add(40);
	
	System.out.println(l3);
	
	
	System.out.println("Create a new list which is combination of l2 and l3 ");
	
	
	ArrayList<Object> l4= new ArrayList();
//	l4.addAll(l2);
	l4.addAll(l3);
	l4.add(50);
	
	System.out.println(l4);
	
	System.out.println("******************************ListIterator*************************************");
	
	
	ListIterator<Object> l5= l4.listIterator();
	//has next method return true if the list iterator has more elements when traversing the list in the forward direction
	//forward 
	while(l5.hasNext())
	{
		System.out.println(l5.next());
	}
	
	System.out.println("Print reverse order");
	//has privious returns true if the list iterator has more elements when traversing the list in the reverse direction
	//reverse order
	while(l5.hasPrevious())
	{
		System.out.println(l5.previous());
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


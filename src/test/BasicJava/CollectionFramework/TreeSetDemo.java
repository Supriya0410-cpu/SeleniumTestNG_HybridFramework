package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> t1= new TreeSet<Object>();
		t1.add(20);
		t1.add(100);
		t1.add(90);
		t1.add(6);
		t1.add(110);
		t1.add(150);
		t1.add(50);
		
		System.out.println(t1);
		
		TreeSet<Object> t2= new TreeSet();
		
		t2.add(34);
		t2.headSet(34);
		t2.add(22);
		t2.add(44);
		
		t2.tailSet(5);
		
		System.out.println(t2);
		
	}

}

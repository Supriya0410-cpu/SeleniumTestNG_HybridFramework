package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Hash map is implements by using map interface 
 * In hashMap value store on the basis of key value pair 
 * Each key value pair is known as a entry 
 * HashMap contains a duplicate elements 
 * HashMap contains unique key 
 * A map is useful if you have to search, update or delete elements on the basis of a key.
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String > hm= new HashMap<Integer, String>();
		hm.put(101, "Supriya");
		hm.put(102, "Sunita");
		hm.put(103, "sujata");
		
		
		System.out.println(hm.size());
		
	System.out.println("value  of 102 key is "+hm.get(102));
	
	hm.isEmpty();
	
	System.out.println("************************************Iteratortion for each loop *******************************************");
		

	for(Entry<Integer, String> i:hm.entrySet())
	{
		//System.out.println(i);
		System.out.println(i.getKey()+":"+i.getValue());
	}
	
	
	System.out.println("********************iterator class*************************");
	
	//convert map into setAdd commentMore actions
			Set<Entry<Integer,String>> set=hm.entrySet();
			
			Iterator<Entry<Integer, String>> ir=set.iterator();
			
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			
	
	
	
	
	
	
	}

}

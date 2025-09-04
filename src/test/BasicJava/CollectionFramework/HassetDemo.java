package CollectionFramework;


/* implement by using list interfance
 * duplicate ele not allowed in hashset if tried to add new element ovveried with old element 
 * by deafult 15 segment allow 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.HashSet;

public class HassetDemo {

	public static void main(String[] args) {
		
		
		
		
		HashSet<Object> h1= new HashSet<Object>();
		
		
		h1.add(10);
		h1.add(20);
		h1.add(30);
		
		h1.contains(30);//true
		
		h1.isEmpty();
		
		
		h1.size();
		
		
		
		
		System.out.println("*******************Ietratotion using for each loop***********************");
		
		
		for(Object i :h1)
		{
			
			System.out.println(i);
		}
		
		

	}

}

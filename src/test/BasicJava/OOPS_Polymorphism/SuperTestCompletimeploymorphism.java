package OOPS_Polymorphism;

/* Run Time Polymorphism
 * Acchive by Method Overriding 
 * 
 * And Method Overriding acchive 
 * 1. Is A relation in class[inhertitance parent class]
 * 2. same method name with same signature 
 * 
 * Main purpose of method overriding :
 * 1. Child class aslo have some extra properties thoes properties access need overriding
 * 2. Retrive the latest updates only 
 * 
 * If You want Parent class data then use very special keyword 
 * 1. super. 
 * 2. Use to access parent class method variable and aslo construtcor
 * 3. Super statement first stetment in method or whereever you want to access data 
 * 
 */
public class SuperTestCompletimeploymorphism {

	public static void main(String[] args) {
		
		SuperChild c1= new SuperChild();
		c1.color();

	}

}

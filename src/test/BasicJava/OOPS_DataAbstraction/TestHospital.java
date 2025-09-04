package OOPS_DataAbstraction;

public class TestHospital {

	public static void main(String[] args) {
		NobelHS n1= new NobelHS();
		
		System.out.println("Scenario 1:- Child class ref child class obj= parent+child");

		n1.dental();//individual
		n1.checkup();//individual
		n1.cardiology();//inherited
		n1.physothericipe();//inherited
		
		n1.braintumerspeclist();//inherited
		n1.cancerspecilist();//inherited
		
		n1.covidtest();
		System.out.println("Scenario 1:- parent class ref parent class obj= parent[INVALID FOR INTERFACE]");
		
	//	IMA i1 = new IMA();//Not allowed in interface
		
		
		System.out.println("Scenario 1:- parent class ref child class obj= parent");
		
		IMA i1= new NobelHS();//parent methods
		i1.physothericipe();
		i1.cardiology();
		i1.covidtest();
		System.out.println("****************************************************");
		
		USMA i2= new NobelHS();// parent methods
		
		i2.cancerspecilist();
		i2.braintumerspeclist();
		i2.covidtest();
	}

}

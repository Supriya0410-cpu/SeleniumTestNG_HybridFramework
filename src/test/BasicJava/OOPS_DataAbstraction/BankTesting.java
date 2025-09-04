package OOPS_DataAbstraction;

public class BankTesting {

	public static void main(String[] args) {
	
		HDFCBank b1= new HDFCBank();
		
		AxisBank a1 = new AxisBank();
		
		System.out.println("Scenario 1:-Child class object child class reference :- Parent+ child method ");
	//HDFCBank	
       b1.showname();
       b1.withdraw();
       b1.deposite();
       b1.loan();
       b1.RateOInterst();
       
       //AxisBank
       System.out.println("*********************************************************");
       a1.showName1();
       a1.withdraw();
       a1.deposite();
       a1.loan();
       a1.RateOInterst();
       
		
		System.out.println("Scenario 2:-Parent class object parent class reference :- Invalid bcz of abstact methods and interface ");
	// NotAllowed in Interface	
	//	RBIBank r2= new RBIBank();
		
	//	r2.deposite();
	//	r2.withdraw();
	//	r2.loan();
	//	r2.RateOInterst();
		
		System.out.println("Scenario 3:-parent class object child class reference :- Parent method ");
		
      RBIBank r1= new HDFCBank();
		
		r1.deposite();
		r1.withdraw();
		r1.loan();
		r1.RateOInterst();
	}

}

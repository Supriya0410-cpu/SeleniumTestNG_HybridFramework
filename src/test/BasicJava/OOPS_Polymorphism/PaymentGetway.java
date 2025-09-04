package OOPS_Polymorphism;

public class PaymentGetway {

	public void paymentmethod() {
		
		System.out.println("User started payment processing");
		
	}
	
	public void paymentmethod(String App)
	{
		
	
		if(App.equals("phonepay"))
			
				
		{
			System.out.println("User selected phonepay app");
			
		}
		else if(App.equals("Gpay"))
		{
			System.out.println("User selected Google pay app");
		}
		else if(App.equals("Paytm"))
		{
			System.out.println("User selected Paytm app");
		}
		else
		{
			System.out.println("User selected application method not allowed ");
		}
			
	}

	
	
	
	
}

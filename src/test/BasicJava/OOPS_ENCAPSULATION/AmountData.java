package OOPS_ENCAPSULATION;

public class AmountData {

	private int amount;
	

	public void setAmount(int amount)
	 
	{
		if(amount>=1000) {
		this.amount = amount;
		
		System.out.println("Your Account Creation initilized");
		}
		else 
		{
			this.amount = amount;
			System.out.println(" OOPS!!For Account Creation Need bal more than 1000 check your balance");
		}
	}
	 
	
	public int getAmount()
	{
		System.out.println(amount);
		//this.amount = amount;
		return amount;
		
	}
}

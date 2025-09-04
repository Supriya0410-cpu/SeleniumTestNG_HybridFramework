package OOPS_DataAbstraction;

public class AxisBank implements RBIBank {
	
	public void showName1()
	{
		System.out.println("Axis............Bank");
	}

	@Override
	public void withdraw() {
		System.out.println("Axis .......withdraw");
		
	}

	@Override
	public void deposite() {
		System.out.println("Axis .......deposite");
		
	}

	@Override
	public void loan() {
		System.out.println("Axis .......loan");
		
	}

	@Override
	public void RateOInterst() {
		System.out.println("Axis .......RateOInterst is 9%");
		
	}

}

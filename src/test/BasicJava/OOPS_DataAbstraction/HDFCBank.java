package OOPS_DataAbstraction;

public class HDFCBank implements RBIBank {

	public void showname()
	{
		System.out.println("HDFC..........From HDFC Class");
	}
	@Override
	public void withdraw() {
		System.out.println("HDFC .......withdraw");
		
	}

	@Override
	public void deposite() {
		System.out.println("HDFC .......deposite");
		
	}

	@Override
	public void loan() {
		System.out.println("HDFC .......loan");
		
	}

	@Override
	public void RateOInterst() {
		System.out.println("HDFC .......RateOInterstis 8%");
		
	}

}

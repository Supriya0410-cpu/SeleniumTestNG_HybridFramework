package OOPS_DataAbstraction;

public class NobelHS implements IMA ,USMA  {

	@Override
	public void physothericipe() {
		System.out.println("IMA...............physothericipe");		
	}

	@Override
	public void cardiology() {
		System.out.println("IMA...............cardiology");
		
	}
	
	public void dental()
	{
		System.out.println("IMA...............dental");
	}
	
	public void checkup()
	{
		System.out.println("IMA...............checkup");
	}

	@Override
	public void cancerspecilist() {
		System.out.println("USMA...............cancerspecilist");
		
	}

	@Override
	public void braintumerspeclist() {
		System.out.println("USMA...............braintumerspeclist");
	}

	@Override
	public void covidtest() {
		System.out.println("WHO......................covidtest");
		
	}
	

}

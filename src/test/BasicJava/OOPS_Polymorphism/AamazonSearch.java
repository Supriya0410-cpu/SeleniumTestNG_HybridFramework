package OOPS_Polymorphism;

public class AamazonSearch {
	
	public void search(float price)
	{
		System.out.println("Product search by the price and price is :"+price);
	}
	
	public void search(String pname, int price)
	{
		System.out.println("Product search by the product name and price :"+pname +price);
	}
	
	public void search(String Category , Float price)
	{
		System.out.println("Product search by the category name and price :"+Category +price);
	}
	
	public void search(String pname)
	{
		System.out.println("Product search by the price and price is :"+pname);
	}
	


}

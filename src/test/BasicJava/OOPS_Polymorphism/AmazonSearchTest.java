package OOPS_Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) {
		
		AamazonSearch a1=new AamazonSearch();
		a1.search(23333);
		a1.search("Jeans");
        a1.search("denim", 999);
       a1.search("Jeans", 999);
			}

}

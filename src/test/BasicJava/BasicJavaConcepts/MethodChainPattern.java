package BasicJavaConcepts;

public class MethodChainPattern {

	
	
	public MethodChainPattern startapp()
	{
		System.out.println("Application Started");
		return this;
	}
	
	
	public MethodChainPattern executedapp() {
		System.out.println("Application executed");
		return this;
	}
	
	
	public MethodChainPattern appstop()
	{
		System.out.println("application closed");
		return this;
		
	}
	
	public ParamaeterrizeConstructor show()
	{
		return new ParamaeterrizeConstructor("SUP",22);
	}
	
	
	public static void main(String[] args) {
	
		MethodChainPattern m1 =new MethodChainPattern();
	MethodChainPattern res=	m1.startapp().executedapp().appstop();

		//System.out.println(MethodChainPattern+" Prog Completed Sucessfully");
	}

}

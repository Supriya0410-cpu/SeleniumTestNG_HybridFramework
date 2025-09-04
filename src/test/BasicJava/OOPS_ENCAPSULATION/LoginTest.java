package OOPS_ENCAPSULATION;

public class LoginTest {

	public static void main(String[] args) {

		
		LoginPage e1= new LoginPage();
				
		e1.setUsername("Sanvi");
		e1.setPassword("Test@123");
	//	e1.setIMPDATA("0000");
		
	//	e1.getIMPDATA();
		
		e1.Dologin(e1.getUsername(), e1.getPassword());
		
		System.out.println("********************************************");
		
		
		LoginPage e2= new LoginPage();
		
		e2.setUsername("shravya");
		e2.setPassword("Amin@123");
		
		e2.Dologin(e2.getUsername(), e2.getPassword());
		
	}

}

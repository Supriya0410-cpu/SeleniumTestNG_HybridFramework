package OOPS_ENCAPSULATION;
/*
 *WAP login page user able to login the page  
 * 
 * 
 * 
 */
public class LoginPage {

	
	private String username;
	private String Password;
	private String IMPDATA;
	
	
	public String getIMPDATA() {
		return IMPDATA;
	}

	public void setIMPDATA(String iMPDATA) {
		IMPDATA = iMPDATA;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	

	public void setPassword(String password) {
		Password = password;
	}
	
	public String getPassword() {
		return Password;
	}
// Act like a click button thats why use method 	
	public void Dologin( String username , String password)
	{
		System.out.println( username+ "Login sucessful");
		
	}
}

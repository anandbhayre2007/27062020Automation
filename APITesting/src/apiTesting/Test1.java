package apiTesting;

public class Test1 {

	public static void main(String[] args) {
		
		
		//Front End
		System.out.println("WelCome to Login Page");
		System.out.println("UserName");
		System.out.println("Password");
		
		//Enter Data on Front End
		loginApi("anand1", "Test@123");
		
	}
	
	public static void loginApi(String username, String password)
	{
		
		if(username.equals("anand") && password.equals("Test@123"))
		{
			System.out.println( "Home Page");
		}else {
			System.out.println("Error Page");
		}
	}
	
}

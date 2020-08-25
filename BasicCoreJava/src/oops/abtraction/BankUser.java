package oops.abtraction;

public class BankUser {

	public static void main(String[] args) {
		
		account(new SBI()); //SBI = Chrome
		
		
		
		
		account(new HDFC());//HDFC = Firefox
		account(new ICICI());//ICICI = Edge
						
		String name="Sudha";
		RBI bank=new ICICI();
		int a=10;		
		
		sum(a);
		message(name);
		account(bank);		
		
		sum(20);
		message("Prachee");
		account(new SBI());

	}
	
	public static void account(RBI bank) //RBI ==WebDriver
	{
		bank.creditCard(); //Navigate
		bank.savingAccount(); //Click
		bank.debitCard(); //Enter data
		bank.currentAccount(); //Select option		
	}
	
	public static void sum(int a)
	{
		System.out.println(10+a);
	}
	
	public static void message(String name)
	{
		System.out.println("Your name is "+name);
	}

}

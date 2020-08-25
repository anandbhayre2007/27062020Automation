package oops.abtraction;

public class HDFC implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("HDFC Saving Account");		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC current Account");
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC debit Card");
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC creditCard");
	}

}

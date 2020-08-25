package oops.abtraction;

public class SBI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("SBI saving account");
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI current account");
	}

	@Override
	public void debitCard() {
		System.out.println("SBI debit card");
	}

	@Override
	public void creditCard() {
		System.out.println("SBI credit Card");
	}

}

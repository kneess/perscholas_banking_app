package bank_accounts_package;


public class Priviledged extends BankAccount{
	
	public Priviledged(String userName, int ssn, String userAddress, String bankName, String bankAddress,
			int routingNumber, int accountNumber, double balance) {
		super(userName, ssn, userAddress, bankName, bankAddress, routingNumber, accountNumber, balance);
		System.out.println(this.getUserName()+ " Opened new Priviledged Account:");
	}
	
	
	
}

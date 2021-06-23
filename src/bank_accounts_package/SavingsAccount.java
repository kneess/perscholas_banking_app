package bank_accounts_package;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String userName, int ssn, String userAddress, String bankName, String bankAddress,
			int routingNumber, int accountNumber, double balance, double initalAmount) {
		super(userName, ssn, userAddress, bankName, bankAddress, routingNumber, accountNumber, balance);
	
		System.out.println(this.getUserName()+ " Opened new Savings Account:");
		super.deposit(initalAmount);
	}
	

	public void savingsAccountInfo()
	{
		System.out.println("Bank: "+ this.getBankName()
		+ "\nCustomer: "+this.getUserName()
	+"\nSavings account balance for account: "+ this.getAccountNumber() + " is: "+ String.format("%.2f", this.getBalance()));
	}
}

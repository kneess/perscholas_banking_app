package bank_accounts_package;

public class CheckingAccount extends BankAccount{
	
	public CheckingAccount(String userName, int ssn, String userAddress, String bankName, String bankAddress,
			int routingNumber, int accountNumber, double balance, double initalAmount) {
		super(userName, ssn, userAddress, bankName, bankAddress, routingNumber, accountNumber, balance);
		
		System.out.println(this.getUserName()+ " Opened new Checkings Account:");
		super.deposit(initalAmount);
	}
	
	

	public void withdraw(double withdrawAmount, Priviledged account) {
		double remainingBalance = this.getBalance() - withdrawAmount;
		if(remainingBalance < 0) {
			super.withdraw(getBalance());
			System.out.println("Overdraft protection activated: withdrawing: "+ String.format("%.2f",remainingBalance) + " from priviledged account");
			account.withdraw(+remainingBalance);
		} else {			
			super.withdraw(withdrawAmount);
		}
	}



	public void checkingAccountInfo()
	{
		System.out.println("Bank: "+ this.getBankName()
		+ "\nCustomer: "+this.getUserName()
	+"\nChecking account balance for account: "+ this.getAccountNumber() + " is: "+ String.format("%.2f",this.getBalance()));
	}
}

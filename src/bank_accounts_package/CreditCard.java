package bank_accounts_package;

public class CreditCard extends BankAccount{
	
	private double latePaymentFee;
	private double annualInterestRate;
	private double limit;
	
	public CreditCard(String userName, int ssn, String userAddress, String bankName, String bankAddress,
			int routingNumber, int accountNumber, double balance, double annualInterestRate, double limit) {
		super(userName, ssn, userAddress, bankName, bankAddress, routingNumber, accountNumber, balance);
		
		this.annualInterestRate = annualInterestRate;		
		this.latePaymentFee = 30;
		this.limit = limit;
		System.out.println(this.getUserName()+ " Opened new Credit Line:");
	}
	
	
	
	@Override
	public void deposit(double depositAmount) {
		//pay into credit card
		double interest = ( this.calculateAmountDue() - this.getBalance() );
		double balancePaid = depositAmount - interest;
		System.out.println("interest paid: "+ String.format("%.2f", interest));
		super.deposit(-balancePaid);
	}



	@Override
	public void withdraw(double withdrawAmount) {
		//adding to owed balance
		super.withdraw(-withdrawAmount);
	}

	public double availableCredit()
	{
		return this.limit - calculateAmountDue();
	}
	
	public void addLatepaymentFee()
	{
		double newBalance = this.getBalance() - this.latePaymentFee;
		this.setBalance(newBalance);
		System.out.println("Late payment fee of: "+ this.latePaymentFee + " charged new balance: "+String.format("%.2f",newBalance));
	}
	
	public double calculateAmountDue()
	{
		double totalAmount = this.getBalance() + (this.getBalance() * ( (this.getAnnualInterestRate()/100) / 12 ) );
		return totalAmount;
	}
	
	public void payOff(int year, String month, double amountPaid)
	{
		//completing payoff amount how to go about payoff
		double payOffAmount = calculateAmountDue();
		this.setBalance(0);
		System.out.println(this.getUserName() + " paid off: "+String.format("%.2f",payOffAmount) + " on: " + month + " : "+year);
	}

	public double getLatePaymentFee() {
		return latePaymentFee;
	}

	public void setLatePaymentFee(double latePaymentFee) {
		this.latePaymentFee = latePaymentFee;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCard [latePaymentFee=" + latePaymentFee + ", annualInterestRate=" + annualInterestRate
				+ ", limit=" + limit + "]";
	}

	public void getCreditInfo() {
		
		System.out.println("Credit limit: "+String.format("%.2f",this.limit) + " balance: "+String.format("%.2f",this.getBalance()) + " available creadit: "
		+ String.format("%.2f",this.availableCredit()) +
				" pay off amount: "+ String.format("%.2f",this.calculateAmountDue()));
		
	}

	
}

package bank_accounts_package;

import java.util.Date;
import java.util.Scanner;

public abstract class BankAccount {

	private String userName;
	private int ssn;
	private String userAddress;
	private String bankName;
	private String bankAddress;
	private int routingNumber;
	private int accountNumber;
	private double balance;
	private Date dateCreated;
	
	public BankAccount()
	{
		
	}
	
	
	public BankAccount(String userName, int ssn, String userAddress, String bankName, String bankAddress,
			int routingNumber, int accountNumber, double balance) {
		this.userName = userName;
		this.ssn = ssn;
		this.userAddress = userAddress;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public void deposit(double depositAmount)
	{

		this.balance += depositAmount;
		System.out.println("Deposited: "+ String.format("%.2f",Math.abs(depositAmount)) + " new balance: "+ String.format("%.2f",this.balance));
		
	}
	
	public void withdraw(double withdrawAmount)
	{
		
		this.balance -= withdrawAmount;
		System.out.println("Withdrew: "+ String.format("%.2f",withdrawAmount) + " new balance: " + String.format("%.2f",this.balance));
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
}

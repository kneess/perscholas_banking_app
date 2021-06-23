package bank_accounts_package;

import java.util.Scanner;

public class Runner {
	
//	checklist
//	bankaccount - done
//	checking - done
//	savings - done
	
//	credit 
//	-deposit
//	-balance
	
//	privilege
//	-overdraft
	

	public static AllAccounts accounts = new AllAccounts();
	public static BankAccount[] allAccounts = accounts.getAllAccounts();
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println();
		
		System.out.print("To access accounts please enter in username:");
		String username = scanner.nextLine();		
		
		//findAcconts get all accounts by username
		BankAccount[] foundAccounts = findAccounts(username);
		
		CheckingAccount foundCheckAccount = (CheckingAccount) foundAccounts[0];
		CreditCard foundCreditAccount = (CreditCard) foundAccounts[1];
		Priviledged foundPriviledgeAccount = (Priviledged) foundAccounts[2];
		SavingsAccount foundSavingsAccount = (SavingsAccount) foundAccounts[3];
		
		
		
		boolean usernameflag = false;
		while(!usernameflag)
		{
			if(foundAccounts[0] == null) {
				System.out.print("Username invalid: Try again: ");
				username = scanner.nextLine();
				foundAccounts = findAccounts(username);
				
				foundCheckAccount = (CheckingAccount) foundAccounts[0];
				foundCreditAccount = (CreditCard) foundAccounts[1];
				foundPriviledgeAccount = (Priviledged) foundAccounts[2];
				foundSavingsAccount = (SavingsAccount) foundAccounts[3];
			} else {
				usernameflag = true;
			}
		}
		
		
		//we get all the accounts
		//search for the account of said user;
		//loop through accounts
		//give the option of user to access accounts
//		loop through account choices
//		when in the account user can modify accounts
		//exit account
		//chose anothre account
		

		System.out.println();
		
		boolean flag = false;
		
		while(!flag)
		{
			
		System.out.println("=========="+username+ "'s"+ " accounts============ ");
		
		System.out.println("\n"
				+ "1 -> Checking Account \n"
				+ "2 -> Credit Account \n"
				+ "3 -> Priviledged Account \n"
				+ "4 -> Savings Account \n"
				+ "5 -> Exit bank");
		System.out.print("Now enter in a digit (1-5) for which account you would like to access:");
		
		//scanning for account choice
		int accountType = scanner.nextInt();
		
		switch(accountType)
		{
		case 1:
			accessCheckingAccount(foundCheckAccount, foundPriviledgeAccount);
			break;
		case 2:
			accessCreditAccount(foundCreditAccount);
			break;	
		case 3:
			accessPriviledgeAccount(foundPriviledgeAccount);
			break;
		case 4:
			accessSavingsAccount(foundSavingsAccount);
			break;
		case 5:
			System.out.println("Thank you for banking with "+foundCheckAccount.getBankName() + " have a good day!");
			flag = true;
		}
		
	}

	}
	
	//Priviledged account access
	
	private static void accessPriviledgeAccount(Priviledged foundPriviledgeAccount) {
		System.out.println("Priviledged account accessed: ");
		foundPriviledgeAccount.toString();
		
		boolean flag = false;
		
		while(!flag)
		{
			
		
		System.out.println("=========Account options===========");
		System.out.println("\n"
				+ "1 -> Deposit \n"
				+ "2 -> Withdraw \n"
				+ "3 -> choose another account");
		System.out.print("Now enter in a digit (1-3) to choose what to do with account:");
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.print("Enter in amount to deposit: ");
			double amount = scanner.nextDouble();
			foundPriviledgeAccount.deposit(amount);
			break;
		case 2:
			System.out.print("Enter in amount to withdraw: ");
			double withdrawAmount = scanner.nextDouble();
			foundPriviledgeAccount.withdraw(withdrawAmount);
			break;
		case 3: 
			System.out.println("Exiting savings account");
			flag = true;
			
		}
		
	}
	}
	
	//Saving account access
	
	private static void accessSavingsAccount(SavingsAccount foundSavingsAccount) {
		System.out.println("Saving account accessed: ");
		foundSavingsAccount.savingsAccountInfo();
		
		boolean flag = false;
		
		while(!flag)
		{
			
		
		System.out.println("=========Account options===========");
		System.out.println("\n"
				+ "1 -> Deposit \n"
				+ "2 -> Withdraw \n"
				+ "3 -> choose another account");
		System.out.print("Now enter in a digit (1-3) to choose what to do with account:");
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.print("Enter in amount to deposit: ");
			double amount = scanner.nextDouble();
			foundSavingsAccount.deposit(amount);
			break;
		case 2:
			System.out.print("Enter in amount to withdraw: ");
			double withdrawAmount = scanner.nextDouble();
			foundSavingsAccount.withdraw(withdrawAmount);
			break;
		case 3: 
			System.out.println("Exiting savings account");
			flag = true;
			
		}
		
	}
	}
	
	//CreditCard account access -- > need to make sure payoff amount works with deposit(balance goes to 0 no interest added as of now)
	
	private static void accessCreditAccount(CreditCard foundCreditAccount) {
		System.out.println("Credit account accessed: ");
		foundCreditAccount.getCreditInfo();
		
		boolean flag = false;
		
		while(!flag)
		{
			
		
		System.out.println("=========Account options===========");
		System.out.println("\n"
				+ "1 -> Deposit -> pay into credit \n"
				+ "2 -> Withdraw -> cash advance \n"
				+ "3 -> choose another account");
		System.out.print("Now enter in a digit (1-3) to choose what to do with account:");
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.print("Enter in amount to deposit: ");
			double amount = scanner.nextDouble();
			foundCreditAccount.deposit(amount);
			break;
		case 2:
			System.out.print("Enter in amount to withdraw: ");
			double cashAdvance = scanner.nextDouble();
			foundCreditAccount.withdraw(cashAdvance);
			break;
		case 3: 
			System.out.println("Exiting credit account");
			flag = true;
			
		}
		
	}
	
		
	}
	
	//CheckingAccount access

	public static void accessCheckingAccount(CheckingAccount account, Priviledged foundPriviledgeAccount)
	{
		System.out.println("Checking account accessed: ");
		account.checkingAccountInfo();
		
		boolean flag = false;
		
		while(!flag)
		{
			
		
		System.out.println("=========Account options===========");
		System.out.println("\n"
				+ "1 -> Deposit \n"
				+ "2 -> Withdraw \n"
				+ "3 -> choose another account");
		System.out.print("Now enter in a digit (1-3) to choose what to do with account:");
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.print("Enter in amount to deposit: ");
			double amount = scanner.nextDouble();
			account.deposit(amount);
			break;
		case 2:
			System.out.print("Enter in amount to withdraw: ");
			double withdrawAmount = scanner.nextDouble();
			//priviledged account its passed as an argument in case the withdraw
			//amount in the checking account is greater than the balance. Then the
			// priviledged account is used as the overdraft protection account
			account.withdraw(withdrawAmount,foundPriviledgeAccount);
			break;
		case 3: 
			System.out.println("Exiting Checking account");
			flag = true;
			
		}
		
	}
	
	}
	
	public static BankAccount[] findAccounts(String username)
	{
		BankAccount[] foundAccounts = new BankAccount[4];
		
		for(BankAccount tempAcc : allAccounts)
		{
			BankAccount currentAccount = tempAcc;
			
			if(currentAccount.getUserName().compareTo(username) == 0 && currentAccount instanceof CheckingAccount)
			{
				foundAccounts[0] = (CheckingAccount) currentAccount;
			}
			
			if(currentAccount.getUserName().compareTo(username) == 0 && currentAccount instanceof CreditCard)
			{
				foundAccounts[1] = (CreditCard) currentAccount;
			}
			
			if(currentAccount.getUserName().compareTo(username) == 0 && currentAccount instanceof Priviledged)
			{
				foundAccounts[2] = (Priviledged) currentAccount;
			}
			
			if(currentAccount.getUserName().compareTo(username) == 0 && currentAccount instanceof SavingsAccount)
			{
				foundAccounts[3] = (SavingsAccount) currentAccount;
			}
			
		}
		return foundAccounts;
	}
}

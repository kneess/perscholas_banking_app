package bank_accounts_package;

public class AllAccounts {

	private BankAccount[] allAccounts = new BankAccount[8];
	
	public AllAccounts()
	{
		
	CheckingAccount benChecking = new CheckingAccount("ben", 258409283, "123 w 45st", "coo bank", "122 coo st", 258409283,
			258409283, 100, 123.44);
	CreditCard benCredit = new CreditCard("ben", 91909749, "123 w 45st", "coo bank", "122 coo st", 91909749 ,
			91909749, 1, 30,2000.00);
	Priviledged benPrivelege = new Priviledged("ben", 14467729 , "123 w 45st", "coo bank", "122 coo st", 14467729 ,
			14467729 , 10);
	SavingsAccount benSaving = new SavingsAccount("ben", 11232378 , "123 w 45st", "coo bank", "122 coo st", 11232378 ,
			11232378 , 0, 22.00);
	
			this.allAccounts[0] = benChecking;
			this.allAccounts[1] = benCredit;
			this.allAccounts[2] = benPrivelege;
			this.allAccounts[3] = benSaving;
			
	CheckingAccount jenChecking = new CheckingAccount("jen", 49343228 , "123 w 45st", "coo bank", "122 coo st", 49343228 ,
			49343228 , 100, 40000);
	CreditCard jenCredit = new CreditCard("jen", 36206727 , "123 w 45st", "coo bank", "122 coo st", 36206727 ,
			36206727 , 134500, 30,200340.00);
	Priviledged jenPrivelege = new Priviledged("jen", 66449128 , "123 w 45st", "coo bank", "122 coo st", 66449128 ,
			66449128 , 10234230);
	SavingsAccount jenSaving = new SavingsAccount("jen", 65612973 , "123 w 45st", "coo bank", "122 coo st", 65612973 ,
			65612973 , 0, 2323.44);

		
		this.allAccounts[4] = jenChecking;
		this.allAccounts[5] = jenCredit;
		this.allAccounts[6] = jenPrivelege;
		this.allAccounts[7] = jenSaving;
	}
	
	
	public BankAccount[] getAllAccounts() {
		return allAccounts;
	}
	
	
	
}


public abstract class BankAccount
{
	//private long lAccountNumber;
	private double dBalance;
	//private String strAccountHolderName;
	
	//default constructor
	public BankAccount()
	{
		
	}
	
	//overloaded constructor
	public BankAccount(double dStartingBalance)
	{
		dBalance = dStartingBalance;
	}
	
	//overloaded constructor
	public BankAccount(double dStartingBalance, String strName)
	{
		dBalance = dStartingBalance;
		//strAccountHolderName = strName;
	}
	
	public void Deposit(double dAmount)
	{
		dBalance += dAmount;
		//System.out.println("This is the deposit method in the parent");
	}
	
	public void Withdraw(double dAmount)
	{
		dBalance -= dAmount;
	}
	
	//public long getlAccountNumber() 
	{
		//return lAccountNumber;
	}

	//public void setlAccountNumber(long lAccountNumber) 
	{
		//this.lAccountNumber = lAccountNumber;
	}

	public double getdBalance() 
	{
		return dBalance;
	}

	public void setdBalance(double dBalance) 
	{
		this.dBalance = dBalance;
	}

	//public String getStrAccountHolderName()
	{
		//return strAccountHolderName;
	}

	//public void setStrAccountHolderName(String strAccountHolderName) 
	{
		//this.strAccountHolderName = strAccountHolderName;
	}
}

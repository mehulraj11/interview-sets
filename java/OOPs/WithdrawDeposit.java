interface Account
{
	public void deposit(double amount);
	public void withdraw(double amount);
	public void addIntrest(double intrest);
	public double getBalance();
}

class SavingsAccount implements Account
{
	private double balance;
	private double intrest;

	public SavingsAccount()
	{
		balance = 0;
		intrest = 0;
	}
	public SavingsAccount(double balance, double intrest)
	{
		this.balance = balance;
		this.intrest = intrest;
	}
	@Override
	public void deposit(double amount)
	{
		balance += amount;
	}
	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	@Override
	public void addIntrest(double intrest)
	{
		balance = balance + (balance * intrest/100); 
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
	
}
class CurrentAccount implements Account
{
	private double balance;
	private double intrest;
	
	public CurrentAccount()
	{
		balance = 0;
		intrest = 0;
	}
	public CurrentAccount(double balance, double intrest)
	{
		this.balance = balance;
		this.intrest = intrest;
	}
	@Override
	public void deposit(double amount)
	{
		balance += amount;
	}
	@Override
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	@Override
	public void addIntrest(double intrest)
	{
		balance = balance + (balance * intrest/100);
	}
	@Override
	public double getBalance()
	{
		return balance;
	}
}

public class WithdrawDeposit
{
	public static void main(String[] args)
	{
		SavingsAccount s1 = new SavingsAccount();
		System.out.println(s1.getBalance());
		s1.deposit(100);
		System.out.println(s1.getBalance());
		s1.withdraw(50);
		System.out.println(s1.getBalance());
		s1.addIntrest(5);
		System.out.println(s1.getBalance());
		System.out.println("-----------------------------------------------");
		CurrentAccount c1 = new CurrentAccount();
		System.out.println(c1.getBalance());
		c1.deposit(500);
		System.out.println(c1.getBalance());
		c1.withdraw(100);
		System.out.println(c1.getBalance());
		c1.addIntrest(5);
		System.out.println(c1.getBalance());
	}
}
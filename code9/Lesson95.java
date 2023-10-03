import java.math.*;

//静态内部类
class Bank
{
	private static int accounts = 0;
	static class Account
	{
		private String id;
		private float money;
		Account(String id, float money)
		{
			this.id = id;
			this.money = money;
			accounts++;
		}
		public void deposit(float m)
		{
			this.money+=m;
		}
		public void withdraw(float m)
		{
			this.money-=m;
		}
		public void AccountInfo()
		{
			System.out.print(this.id + ", " + this.money+ "," + "\n");
		}
	}
	public void BankInfo()
	{
		System.out.print(accounts+"\n");	
	}
}

public class Lesson95
{
	public static void main(String[] args)
	{
		Bank.Account a1 = new Bank.Account("1001",1234.5f);
		Bank.Account a2 = new Bank.Account("1002",5000.5f);
		Bank b1  = new Bank();
		a1.deposit(300.0f);
		a1.withdraw(10.0f);
		a1.AccountInfo();
		a2.AccountInfo();
		b1.BankInfo();
	}
}
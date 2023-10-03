import java.time.LocalDate;
import java.util.Locale;

class Account
{
	private int id;
	private double banlance;
	private double annualRate;
	private LocalDate dateCreated;

	Account(int id, double banlance)
	{
		this.id = id;
		this.banlance = banlance;
		this.dateCreated = LocalDate.now();
	}
	Account()
	{
		
	}
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public double getBalance()
	{
		return this.banlance;
	}
	public void setBalance(double banlance)
	{
		this.banlance = banlance;
	}
	public double getAnnualRate()
	{
		return this.annualRate;
	}
	public void setAnnualRate(double annualRate)
	{
		this.annualRate = annualRate;
	}
	public LocalDate getDateCreated()
	{
		return this.dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return this.annualRate/12;
	}
	public void withDraw(double amount)
	{
		this.banlance = this.banlance+amount;
	}
	public void deposit(double amount)
	{
		this.banlance = this.banlance-amount;
	}

}

class Lesson411
{
	public static void main(String[] args)
	{
		Account c = new Account();
		Account c1 =  new Account(10,10.5);
		System.out.println(c.getId());
		System.out.println(c.getDateCreated());
		System.out.println(c1.getMonthlyInterestRate());
	}
}
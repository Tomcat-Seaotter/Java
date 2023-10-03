class Stock
{
	private String symbol;
	private String name;
	private double previousPrice;
	private double currentPrice;
	
	Stock(String symbol, String name, double p, double c)
	{
		this.symbol = symbol;
		this.name = name;
		this.previousPrice = p;
		this.currentPrice = c;
	}

	public double getChangePercent()
	{
		return -(this.currentPrice-this.previousPrice)/this.currentPrice*100;
	}
}

class Lesson45
{
	public static void main(String[] args)
	{
		Stock r1 =  new Stock("60000","浦发银行",25.5,28.6);
		System.out.println(r1.getChangePercent());
	}
}
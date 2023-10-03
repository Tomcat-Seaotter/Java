class Cat
{
	private String type;
	Cat()
	{}
	Cat(String type)
	{this.type=type;}
	public String getType()
	{
		return this.type;
	}
	public void setType(String t)
	{this.type=t;}
}

class Lion extends Cat
{
	private int length;
	private int weight;
	Lion(){}
	Lion(String t,int length, int weight)
	{
		super(t);
		this.length=length;
		this.weight =weight;
	}
}
class Tiger extends Cat
{
	private int length;
	private int weight;
	Tiger(){}
	Tiger(String t,int length, int weight)
	{
		super(t);
		this.length=length;
		this.weight =weight;
	}	
}

class Panther extends Cat
{
	private int length;
	private int weight;
	Panther(){}
	Panther(String t,int length, int weight)
	{
		super(t);
		this.length=length;
		this.weight =weight;
	}
}

public class CatTest
{
	public static void main(String[] args)
	{
		Panther p = new Panther("tim",12,23);
		Lion l = new Lion("john",12,23);
		Tiger t = new Tiger("white",15,23);
		p.getType();
		l.getType();
		t.getType();
	}
}

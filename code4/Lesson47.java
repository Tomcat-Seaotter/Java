import java.util.Scanner;

class Lesson47
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		QuardraticEquation q =  new QuardraticEquation(a,b,c);
		if(q.getDiscriminant()>0)
		{
			System.out.println(q.getRoot1());
			System.out.println(q.getRoot2());
		}
		else if(q.getDiscriminant()==0)
		{
			System.out.println(q.getRoot1());
		}
		else
		{
			System.out.println("方程无根");
		}

	}

}

class QuardraticEquation
{
	private int a;
	private int b;
	private int c;

    QuardraticEquation(int a, int b, int c)
    {
		this.a = a;
		this.b = b;
		this.c = c;
    }
	public void setA(int a)
	{
		this.a = a;
	}
	public void setB(int b)
	{
		this.b = b;
	}
	public void setC(int c)
	{
		this.c = c;
	}
	public int getA()
	{
		return this.a;
	}
	public int getB()
	{
		return this.b;
	}
	public int getC()
	{
		return this.c;
	}
    public double getDiscriminant()
    {
    	return (this.b*this.b)-4.0*this.a*this.c;
    }
    public double getRoot1()
    {
    	double x1=0;
    	if(getDiscriminant()>=0)
    	{
    		x1 = (-this.b+Math.sqrt(this.b*this.b-this.a*this.c*4.0))/(2*this.a);
    	}
    	return x1;
    }
    public double getRoot2()
    {
    	double x2=0;
    	if(getDiscriminant()>=0)
    	{
    		x2 = (-this.b-Math.sqrt(this.b*this.b-this.a*this.c*4.0))/(2*this.a);
    	}
    	return x2;
    }

}
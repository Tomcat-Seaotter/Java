import java.util.Scanner;

class Lesson49
{
	public static void main(String[] args)
	{
 	MyInteger integer = new MyInteger(47);
 	System.out.print(integer.equals(15)+"\n");
 	System.out.print(integer.isPrime()+"\n");
 	char[] c = {'1','2','3'};
 	System.out.print(integer.parseInt(c));
	}

}

class MyInteger
{
	private int value;

    MyInteger(int value)
    {
		this.value = value;
    }
	public int getValue()
	{
		return this.value;
	}
	public boolean isEven()
	{
		 if(this.value%2==1)
		 	return false;
		 else
		 	return true;
	}
	public boolean isOdd()
	{
		 if(this.value%2==0)
		 	return false;
		 else
		 	return true;
	}
	public boolean isPrime()
	{
		int i=2;
		boolean flag = true;
		while(i<=(int)Math.sqrt(this.value))
			{
				if(this.value%i==0)
					{
						flag = false;
						break;
					}
					i++;
			}
		return flag;
	}
	public boolean isEven(int n)
	{
		 if(n%2==1)
		 	return false;
		 else
		 	return true;
	}
	public boolean isOdd(int n)
	{
		 if(n%2==0)
		 	return false;
		 else
		 	return true;
	}
	public boolean isPrime(int n)
	{
		int i=2;
		boolean flag = true;
		while(i<=(int)Math.sqrt(n))
			{
				if(n%i==0)
					{
						flag = false;
						break;
					}
					i++;
			}
		return flag;
	}

	public boolean isEven(MyInteger n)
	{
		 if((n.getValue()%2)==1)
		 	return false;
		 else
		 	return true;
	}
	public boolean isOdd(MyInteger n)
	{
		 if(n.getValue()%2==0)
		 	return false;
		 else
		 	return true;
	}
	public boolean isPrime(MyInteger n)
	{
		int i=2;
		boolean flag = true;
		while(i<=(int)Math.sqrt(n.getValue()))
			{
				if(n.getValue()%i==0)
					{
						flag = false;
						break;
					}
					i++;
			}
		return flag;
	}

	public boolean equals(int n)
	{
		 if(this.value==n)
		 	return true;
		 else
		 	return false;
	}
	public boolean equals(MyInteger n)
	{
		 if(this.value==n.getValue())
		 	return true;
		 else
		 	return false;
	}
	
	public int parseInt(char[] c)
	{
		int i;
		int s = 0;
		for(i=0;i<c.length;i++)
		{
			s=10*s+(c[i]-'0');
		}
		 return s;
	}

	public int parseInt(String c)
	{
		return Integer.parseInt(c);
	}

}
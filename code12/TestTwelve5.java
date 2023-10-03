class TestTwelve5
{
	public static void method(int value) throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		if(value==0)
		{
			System.out.print("No Exception\n");
		}
		else if(value==1)
		{
			int[] a = new int[4];
			a[4]=3;
		}
	}
	public static void main(String[] args)
	{
	try
	{
	method(0);
	method(1);
	method(2);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.print("finally\n");
	}
}
}
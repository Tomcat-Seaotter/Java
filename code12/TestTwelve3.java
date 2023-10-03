class TestTwelve3
{
	public static void method(int value)
	{
		try
		{
			if(value==0)
			{
				System.out.print("No Exception\n");
				return ;
			}
			else if(value==1)
			{
				int i=0;
				System.out.print(4/i);
			}
			else if(value==2)
			{
				int[] a = new int[4];
				a[4] =10;
			}
		}
		catch(ArithmeticException e)
		{
				e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
				e.printStackTrace();
		}
			catch(Exception e)
			{
				e.getMessage();
			}
			finally
			{
				System.out.print("finally\n");
			}
	
	}
	public static void main(String[] args)
	{
	method(0);
	method(1);
	method(2);
	}
}
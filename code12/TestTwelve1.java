class TestTwelve1
{
	public static void main(String[] args)
	{
	String name = null;
	int[] a= {1,2,3};
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	// System.out.print(name.length()+"\n");
	
	try
	{
			int b = 3/0;
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	}
}
class TestTwelve2
{
	public static void main(String[] args)
	{
	try
	{
		String name = null;
		System.out.print(name.length());
	}
	catch(NullPointerException ne)
	{
		ne.printStackTrace();
	}	
	try
	{
	int[] a= {1,2,3};
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
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
	try
	{
		Object o = new Object();
		String s = (String)o;
	}
	catch(ClassCastException ce)
	{
		ce.printStackTrace();
	}
	try
	{
		double d = Double.parseDouble("5m7.8");
	}
	catch(NumberFormatException nfe)
	{
		nfe.printStackTrace();
	}
	}
}
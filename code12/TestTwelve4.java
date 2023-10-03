class TestTwelve4
	public static void method()
	{
			int a = 88, b =0;
			int result;
			char[] letter = {'A','B','C'};
			for(int i=0;i<2;i++)
			{
				try
				{
					if(i==0)
						result =a/b;
					else
						letter[5]='X';
				}
				catch(ArithmeticException | ArrayIndexOutOfBoundsException me)
				{
					System.out.print("Catch Exception"+me+"\n");
				}
			}
	}
	public static void main(String[] args)
	{
	method();
	}
}
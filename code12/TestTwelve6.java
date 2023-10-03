import java.io.*;

class Father
{
	public void test() throws Exception
	{
		System.out.print("Father test\n");
	}
}

class Son extends Father
{
	public void test() throws IOException
	{
		System.out.print("Son test\n");
	}
}

class Grandson extends Son
{
	//Error
 	public void test() throws FileNotFoundException
	{
		System.out.print("GrandSon test\n");
	}
}


class TestTwelve6
{
	public static void main(String[] args)
	{
	try
	{
	Father f = new Father();
	Son s = new Son();
	Grandson g = new Grandson();
	f.test();
	s.test();
	g.test();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.print("finally\n");
	}
}
}
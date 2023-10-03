import java.io.*;

class TestTwelve7
{
	public static void method() throws IOException
	{
	try
	{
	throw new IOException("File Not Found\n");
	}
	catch(IOException e)
	{
		System.out.print("Catch Exception\n");
		throw e;
	}
	}
	public static void main(String[] args)
	{
	try
	{
		method();
	}
	catch(IOException e)
	{
		System.out.print("Catch IOException again\n");
	}
	}
}
import java.io.*;
import java.util.Scanner;

class MyException extends Exception
{
	MyException()
	{
		System.out.print("MyException\n");
	}
	MyException(String message)
	{
		super(message);
	}
}

class MyException1 extends Exception
{
	MyException1()
	{
		System.out.print("MyException1\n");
	}
	MyException1(String message)
	{
		super(message);
	}
}

class TestTwelve9
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	double radius = 0;
	double area = 0;
	System.out.print("input radius");
	try
	{
		radius = sc.nextDouble();
		if(radius<0)
		{
			throw new MyException("radius less than 0");
		}
		else
		{
			area = Math.PI*radius*radius;
			System.out.print("Circle area = " + area);
		}
	}
	catch(MyException e)
	{
		System.out.print(e.getMessage());
	}
	}
}
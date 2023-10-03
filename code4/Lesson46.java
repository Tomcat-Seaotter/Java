import java.util.Scanner;

class Lesson46
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}

	public static int fib(int n)
	{
		int y;
		if(n==1)
			y=1;
		else if(n==2)
			y=1;
		else
			y=fib(n-1)+fib(n-2);
		return y;
	}
}
import java.util.Scanner;

class Lesson65
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
	    System.out.print(toBinary(s));
	}

	public static String toBinary(int value)
	{
		String s="";
		while(value>0)
		{
			s = String.valueOf(value%2)+s;
			value/=2;
		}
		return s;
	}
}
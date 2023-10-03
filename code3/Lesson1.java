import java.util.*;
public class Lesson1
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.print("Number is even");
		}
		else
		{
			System.out.print("Number is odd");
		}
	}
}
import java.util.*;
public class Lesson14
{
	public static void main(String[] args)
	{
		double j, sum;
		sum = 0;
		j=3;
		while(j<100)
		{
			sum+=(j-2)/j;
			j+=2;
		}
		System.out.print("sum ="+sum);
	}
}
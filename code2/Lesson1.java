import java.util.*;
import java.lang.*;
public class Lesson1
{
	public static void main(String[] args)
	{
		double temperture,f;
  		Scanner sc = new Scanner(System.in);
  		f = sc.nextDouble();
		temperture = (5.0f/9)*(f -32);
		System.out.format("temperture = %.2f \n", temperture);
	}
}
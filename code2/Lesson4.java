import java.util.*;
import java.lang.*;
public class Lesson4
{
	public static void main(String[] args)
	{
		int number,a,b,c,d;
  		Scanner sc = new Scanner(System.in);
  		number = sc.nextInt();
  		a = number % 10;
  		b = (int)(number/10)%10;
  		c = (int)number/100;
		d = a+b+c;
		System.out.format("d=%d\n",d);
	}
}
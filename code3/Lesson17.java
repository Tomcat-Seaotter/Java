import java.util.*;
public class Lesson17
{
	public static void main(String[] args)
	{
	int i,j,c,d;
	Scanner sc = new Scanner(System.in);
	i = sc.nextInt();
	j = sc.nextInt();
	c = gcd(i,j);
	d = lcm(i,j);
	System.out.print("gcd="+c+"\n");
	System.out.print("lcm="+d);
	}

	public static int gcd(int a, int b)
	{
		int c;
		if(a<b)
		{
			c=a;
			a=b;
			b=c; 
		}
		c = 0;
		while(b>0)
		{
			c = a%b;
			a = b;
			b = c;
		}
		return a;
	}

	public static int lcm(int a, int b)
	{
		int c;
		c = a*b/gcd(a,b);
		return c;
	}
}
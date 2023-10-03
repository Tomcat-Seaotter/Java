import java.util.*;
public class Lesson4
{
	public static void main(String[] args)
	{
		double a, b, c, x1, x2;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if((b*b-4*a*c)>0)
		{
			x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.print("方程有两个实根");	
			System.out.print("x1 = " + x1 + "\n");
			System.out.print("x2 = " + x2);
		}
		else if((b*b-4*a*c)==0)
		{
			x1 = -b/(2*a);
			System.out.print("方程有一个实根");	
			System.out.print("x1 = " + x1 + "\n");
		}
		else
		{
			System.out.print("方程无实根");	
		}
	}
}
import java.util.*;
import java.lang.*;
public class Lesson6
{
	public static void main(String[] args)
	{
                double a,b,c;
                double x;
                Scanner sc = new Scanner(System.in);
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                x = (-b+Math.sqrt(b*b-4*a*c))/(2*a);        
                System.out.println("x= " + x);
	}
}
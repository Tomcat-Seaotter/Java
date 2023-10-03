import java.util.Scanner;
import static java.lang.System.*;

class TestC2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y;
		if(x>=0)
		{
			y = Math.sin(x)+Math.log(x)/Math.log(2)+3*Math.pow(x,5);
		}
		else
		{
			y = Math.exp(-x)+Math.abs(x);
		}
		out.print(y);
	}
}
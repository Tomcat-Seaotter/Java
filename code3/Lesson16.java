import java.util.*;
public class Lesson16
{
	public static void main(String[] args)
	{
		int i,a,b,c;
		i = 100;
		while(i<1000)
		{
			a = i%10;
			b = i/10%10;
			c = i/100;
			if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i)
			{
				System.out.print("1000内的水仙花数是"+i+"\n");
			}
			i++;
		}
	}
}
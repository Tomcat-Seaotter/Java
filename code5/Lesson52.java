import java.util.*;
public class Lesson52
{
	public static void main(String[] args)
	{
		int i;
		int[] b = rand_number();
		for(i=0;i<b.length;i++)
		{
			System.out.print((i+1) + "=" + b[i]+"\t");
		}
	}

	public static int[] rand_number()
	{
		int i;
		int[] a = new int[100];
		int[] b = new int[6];
		for(i=0;i<a.length;i++)
		{
			a[i] =(int)(Math.random()*6+1);
			b[a[i]-1]++;
		}
		return b;
	}
}
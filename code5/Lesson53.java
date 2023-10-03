import java.util.*;
public class Lesson53
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		double[] a  = new double[5];
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.print(min(a));
	}

	public static double min(double[] a)
	{
		double min;
		int i;
		min = a[0];
	 	for(i=1;i<a.length;i++)
	 	{
	 		if(min>a[i])
	 			min = a[i];
		 }
		 return min;
	}
}
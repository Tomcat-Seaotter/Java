import java.util.*;
public class Lesson6
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int i, max, min;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		min=max=a[0];
		for(i=0;i<10;i++)
		{
			if(max<a[i]) max = a[i];
			if(min>a[i]) min = a[i];
		}
		System.out.print("min=" + min + "\n");
		System.out.print("max=" + max + "\n");	
	}
}
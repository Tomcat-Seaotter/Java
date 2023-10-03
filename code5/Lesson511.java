import java.util.*;
public class Lesson511
{
	public static void main(String[] args)
	{
		int i;
		boolean[] a = new boolean[101];
		for(i=0;i<a.length;i++)
		{
			a[i] = true;
		}
		filter(a);
	}

	public static void filter(boolean[] a)
	{
		int i,j;
	 	for(i=2;i<=(int)(Math.sqrt(a.length));i++)
	 	{
	 		j = i;
	  		while(j<=(a.length/i))
	  		{
	  			a[i*j]=false;
	  			j++;
	  		}
		 }
	 	for(i=2;i<a.length;i++)
	 	{
	 		if(a[i]==true)
	 		{
	 		System.out.print(i+" ");
	 		}
		} 
	}
}
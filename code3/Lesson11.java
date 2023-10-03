import java.util.*;
public class Lesson11
{
	public static void main(String[] args)
	{
		int i,j;
		i=100;
		j=1;
		while(i<=1000)
		{
			if((i%5==0)&&(i%6==0))
			{
				System.out.print(i + " ");
				if(j%10==0)
				{
					System.out.print("\n");
				}
				j++;
			}
			i++;
		}
	}
}
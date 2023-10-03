import java.util.Scanner;

public class Test1
{
	public static void main(String[] args)
	{
		int i,j;
		i =1;
		int sum = 0;
		int count = 0;
		while(i<=1000)
		{
			j=i;
			if(j%7!=0)
			{
				while(j!=0)
			   		{
					if(j%10==7)
					{
						sum+=j;
						count++;
						break;
					}
					else
					{
						j/=10;
					}
				}
			}
			else if(i%7==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.print("sum="+sum+"\n");
		System.out.print("count="+count+"\n");
	}
}
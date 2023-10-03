import java.util.Scanner;

public class Test31
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
			if(i%7!=0)
			{
				while(j!=0)
			   		{
					if(j%10==7)
					{
						sum+=i;
						count++;
						System.out.print(i+"\t");
						break;
					}
					else
					{
						j=j/10;
					}
				}
			}
			if(i%7==0)
			{
				sum+=i;
				count++;
				System.out.print(i+"\t");
			}
			// if(i%7==0||i%10==7||i/10%10==7||i/100==7)
			// {
			// 	sum+=i;
			// 	count++;
			// 	System.out.print(i+"\t");
			// }
			i++;
		}
		System.out.print("sum="+sum+"\n");
		System.out.print("count="+count+"\n");
	}
}
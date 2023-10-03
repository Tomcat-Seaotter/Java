import java.util.*;
public class Lesson10
{
	public static void main(String[] args)
	{
		int i,temp,count,sum;
		i=1;
		count = 0;
		sum = 0;
		while(i<=1000)
		{
			temp = i;
			while((temp!=0)&&(temp%7!=0))
			{
				if(temp%10==7)
				{
					sum+=i;
					count++;
					break;
				}
				temp/=10;
			}
			if(i%7==0)
			{
				sum+=i;
				count++;
			}
			i++;
		}
			System.out.print("0~1000含有7或者是7的倍数的整数之和 "+ sum + "个数 " + count +"\n");
	}
}
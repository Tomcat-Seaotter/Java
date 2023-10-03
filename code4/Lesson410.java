import java.util.Scanner;

class Lesson410
{
	public static void main(String[] args)
	{
		int i, count;
		count = 0;
 		i = 2;
 		// System.out.print(Prime(i));
 		// System.out.print(Palindrome(i));
 		while(count<20)
 		{
 			if(Prime(i)&& Palindrome(i))
 			{
 				System.out.print(i+"\t");
 				count++;
 				if(count%10==0&&count!=0)
 			    {
 				System.out.print("\n");
 				}
 				if(count==20)
 				{
 				break;
 				}
 			}
 			i++;
 		}
	}

	public static boolean Prime(int n)
	{
		int i =2;
		boolean flag = true;
		while(i<=Math.sqrt(n))
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}

	public static boolean Palindrome(int n)
	{
		int s = 0;
		int t = n;
		while(t>0)
		{
			s = s*10+ t%10;
			t=t/10;
		}
		if(s==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


import java.util.Scanner;
import static java.lang.System.*;

class TestC3
{
	public static int[] frequence(String s)
	{
		int[] a = new int[10];
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)-'0'>=0&&s.charAt(i)-'9'<=0)
			{
				a[s.charAt(i)-'0']++;
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] b = frequence(s);
		for(int i=0;i<b.length;i++)
		{
			out.print(i+" " + b[i]+"\t");
		}

	}
}
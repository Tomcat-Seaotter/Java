import java.util.Scanner;
import static java.lang.System.*;

class TestC1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		s1 = sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s2=s2+s1.charAt(i);
			}
		}
		out.println(s2);
	}
}
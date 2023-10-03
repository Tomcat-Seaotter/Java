import java.util.Scanner;

public class Test67
{
	public static String encode(String s)
	{
		char c;
		String des = "";
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if (c>=65 && c<90)
			{
				des+=(char)(c+1);
			}
			else if(c ==90)
			{
				des+=(char)(c-25);
			}
			else if(c>=97 && c<122)
			{
				des+=(char)(c+1);
			}
			else if(c==122)
			{
				des+=(char)(c-25);
			}
		}
		return des;
	}

	public static String decode(String s)
	{
		char c;
		String des = "";
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if (c>65 && c<=90)
			{
				des+=(char)(c-1);
			}
			else if(c==65)
			{
				des+=(char)(c+25);
			}
			else if(c>97 && c<=122)
			{
				des+=(char)(c-1);
			}
			else if(c==97)
			{
				des+=(char)(c+25);
			}
		}
		return des;
	}
	public static void main(String[] args)
	{
		String str,str1;
		System.out.print("请输入编码字符串\n");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		str1 = encode(str);
		System.out.print("编码后的字符串是\n"+str1+"\n");
		System.out.print("请输入编码后字符串\n");
		str = sc.nextLine();
		str1 = decode(str);
		System.out.print("编码前的字符串是\n"+str1);
	}
}
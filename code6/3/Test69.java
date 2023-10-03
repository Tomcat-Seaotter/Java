import java.util.Scanner;

public class Test69
{
	public static String[] stringsplite(String s)
	{
 		StringBuilder str = new StringBuilder();
 		String[] str1;
 		for(int i=0;i<s.length();i++)
 		{
 			if(s.charAt(i)==','||s.charAt(i)=='.')
 			{
 				str.append(' ');
 			} 
 			else
 			{
 				str.append(s.charAt(i));
 			}			
 		}
 		str1 = str.toString().split(" ");
		return str1;
	}
	public static void main(String[] args)
	{
		String str;
		String[] str1;
		System.out.print("请输入字符串\n");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		str1 = stringsplite(str);
		for(String s: str1)
		{
			System.out.print(s+"\n");
		}
	}
}
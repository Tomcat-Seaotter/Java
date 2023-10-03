import java.util.Scanner;

class Lesson67
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    System.out.print(encrypt(s));
	}

	public static String encrypt(String s)
	{
		int i=0;
		String dstr="";
		while(i<s.length())
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<'z')
			{
				dstr+=(char)(s.charAt(i)+1);
			}
			else if(s.charAt(i)=='z')
			{
				dstr+='a';
			}
			if(s.charAt(i)>='A'&&s.charAt(i)<'Z')
			{
				dstr+=(char)(s.charAt(i)+1);
			}
			else if(s.charAt(i)=='Z')
			{
				dstr+='A';
			}
			i++;
		}
		return dstr;
	}
}
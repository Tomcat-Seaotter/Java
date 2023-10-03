import java.util.Scanner;

class Lesson68
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    System.out.print(decrypt(s));
	}

	public static String decrypt(String s)
	{
		int i=0;
		String dstr="";
		while(i<s.length())
		{
			if(s.charAt(i)>'a'&&s.charAt(i)<='z')
			{
				dstr+=(char)(s.charAt(i)-1);
			}
			else if(s.charAt(i)=='a')
			{
				dstr+='z';
			}
			if(s.charAt(i)>'A'&&s.charAt(i)<='Z')
			{
				dstr+=(char)(s.charAt(i)-1);
			}
			else if(s.charAt(i)=='A')
			{
				dstr+='Z';
			}
			i++;
		}
		return dstr;
	}
}
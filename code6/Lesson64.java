import java.util.Scanner;

class Lesson64
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    System.out.print(countLetters(s));
	}

	public static int countLetters(String s)
	{
		int i,count;
		s = s.toLowerCase();
		i=count=0;
		while(i<s.length())
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				count++;
			}
			i++;
		}
		return count;
	}
}
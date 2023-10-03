import java.util.Scanner;

class Lesson69
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    String[] s1 = parse(s);
	    for(int i=0;i<s1.length;i++)
	    {
	    	System.out.print(s1[i]+" ");
	      }
	}

	public static String[] parse(String s)
	{
		String[] str = s.split(",.");
		return str;
	}
}
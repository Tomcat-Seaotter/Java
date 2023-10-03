import java.util.Scanner;

class Lesson66
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    System.out.print(sort(s));
	}

	public static String sort(String s)
	{
		int i,j;
		char t;
		i=0;
		char[] c= s.toCharArray();
		while(i<c.length-1)
		{
			j=c.length-1;
			while(j>i)
			{
				if(c[j]<c[j-1])
				{
					t = c[j];
					c[j] =c[j-1];
					c[j-1] =t;
				}
				j--;
			}
			i++;
		}
		return new String(c);
	}
}
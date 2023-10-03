import java.util.Scanner;

class Lesson62
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		if(s.indexOf(s1)!=-1)
		{
			System.out.print(s1+" is "+s+" substring");
		}
		else
		{
			System.out.print(s1+" is not "+s+" substring");
		}
	}
}
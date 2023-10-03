import java.util.Scanner;

class Lesson61
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(s.length());
		System.out.print(s.charAt(0));
		System.out.print(s.charAt(s.length()-1));

	}
}
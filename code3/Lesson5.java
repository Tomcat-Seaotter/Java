import java.util.*;
public class Lesson5
{
	public static void main(String[] args)
	{
		double score;
		char c;
		Scanner sc = new Scanner(System.in);
		score = sc.nextDouble();
		switch((int)score/10)
		{
			case 10:
				c = 'A';
			case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			default:
				c = 'E';
		}
		System.out.print("五分制分数为 " + c + "\n");	
	}
}
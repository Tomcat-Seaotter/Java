import java.util.*;
public class Lesson19
{
	public static void main(String[] args)
	{
	int i,j,n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(j=2;j<=n;j++)
	{
		while(n%j==0)
		{
			System.out.format("%2d",j);
			n/=j;
		}
	}
	}
}
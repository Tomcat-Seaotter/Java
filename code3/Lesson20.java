import java.util.*;
public class Lesson20
{
	public static void main(String[] args)
	{
	int i,j,n;
	j=1;
	double pi = 0;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(i=1;i<=n;i+=2)
	{
		if(j%2==0)
		{
			pi+=-1.0*(4.0/i);
		}
		else
		{
			pi+=(4.0/i);
		}
		j++;
	}
	System.out.format("PI = %.10f",pi);
	}
}
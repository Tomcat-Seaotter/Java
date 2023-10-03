import java.util.*;
public class Lesson12
{
	public static void main(String[] args)
	{
		long i,j,sum;
		j=0;
		sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		i = sc.nextInt();
		while(i>0)
		{
			j=i%10;
			sum+=j;
			i/=10;
		}
		System.out.print("各位数字之和"+sum);
	}
}
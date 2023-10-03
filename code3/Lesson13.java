import java.util.*;
public class Lesson13
{
	public static void main(String[] args)
	{
		int i,j,temp;
		String binary = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		i = sc.nextInt();
		temp=i;
		while(temp>0)
		{
			j=temp%2;
			binary = String.valueOf(j)+binary;
			temp/=2;
		}
		System.out.print(i+"数字的二进制"+binary);
	}
}
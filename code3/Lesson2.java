import java.util.*;
public class Lesson2
{
	public static void main(String[] args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		year = sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.print(year+"年是闰年");
		}
		else
		{
			System.out.print(year+"年不是闰年");
		}
	}
}
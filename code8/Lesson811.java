import java.time.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;

public class Lesson811
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("输入一个年份和月份");
		int year = sc.nextInt();
		int month = sc.nextInt();
		LocalDate dates = LocalDate.of(year,month,1);
		String monthName = dates.getMonth().getDisplayName(TextStyle.FULL,Locale.getDefault());
		int daysOfMonth = dates.lengthOfMonth();
		System.out.println(year+"年  " +monthName);
		System.out.println("-----------------------------");
		System.out.printf("%3s%3s%3s%3s%3s%3s%3s%n","一","二","三","四","五","六","日");
		int dayOfWeek = dates.getDayOfWeek().getValue();
		for(int i=2;i<=dayOfWeek;i++)
		{
			System.out.printf("%4s"," ");
		}
		for(int i=1;i<=daysOfMonth;i++)
		{
			System.out.printf("%4d",i);
			if((dayOfWeek+i-1)%7==0)
			{
				System.out.println();
			}
		}
	}

}
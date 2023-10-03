import java.time.DayOfWeek;

//静态内部类
public class Lesson97
{
	public static void describe(DayOfWeek day)
	{
		switch(day)
		{
			case MONDAY:
			System.out.print("Monday are bad."+"\n");
			break;
			case FRIDAY:
			System.out.print("Friday are better."+"\n");
			break;
			case SATURDAY:
			case SUNDAY:
			System.out.print("Weekends are best."+"\n");
			break;
			default:
			System.out.print("Midweek days are so-so."+"\n");
			break;
		}
	}
	public static void main(String[] args)
	{
		DayOfWeek first = DayOfWeek.MONDAY;
		describe(first);
		DayOfWeek third = DayOfWeek.WEDNESDAY;
		describe(third);
		DayOfWeek seven = DayOfWeek.SUNDAY;
		describe(seven);
	}
}
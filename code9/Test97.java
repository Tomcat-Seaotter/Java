import static java.lang.System.*;
import java.time.DayOfWeek;

class Enumswitch
{
    public static void describe(DayOfWeek day)
    {
        switch(day)
        {
            case MONDAY:
            out.println("Monday is bad");
            break;
            case FRIDAY:
            out.println("Fridays are better");
            break;
            case SATURDAY:
            case SUNDAY:
            out.println("Weekends are best");
            break;
            default:
            out.println("midweek are so-so");
            break;
        }
    }
   
}

public class Test97
{
public static void main(String[] aegs)
{
    DayOfWeek day = DayOfWeek.MONDAY;
    Enumswitch.describe(day);
    DayOfWeek day1 = DayOfWeek.WEDNESDAY;
    Enumswitch.describe(day1);
    DayOfWeek day2 = DayOfWeek.SUNDAY;
    Enumswitch.describe(day2);
}
}
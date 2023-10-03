import java.math.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static java.lang.System.*;

public class Test816
{
    public static void main(String[] args)
    {
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.of(1994,Month.APRIL,15,11,30);
        out.print(time1.isBefore(time2));
        out.println(time1.plusMonths(6));
        out.println(time2.minusMonths(2));
        out.println(time1);
    }
}
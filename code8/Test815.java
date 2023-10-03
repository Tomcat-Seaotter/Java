import java.math.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import static java.lang.System.*;

public class Test815
{
    public static void main(String[] args)
    {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(22,30);
        out.print(time1.isBefore(time2));
        time1 = time1.truncatedTo(ChronoUnit.SECONDS);
        out.println(time1);
    }
}
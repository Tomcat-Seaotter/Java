import java.math.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import static java.lang.System.*;

public class Test819
{	
    public static void main(String[] args)
    {
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(1990,Month.JANUARY,1);
    Period p = Period.between(birthday,today);
    long p2 = ChronoUnit.DAYS.between(birthday,today);
    out.println("You are " + p.getYears() +"years, "+p.getMonths()+"month, and "+p.getDays()+"days old.("+p2+"day total)");
    }
}
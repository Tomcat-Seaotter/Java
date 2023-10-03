import java.math.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Clock;
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

public class Test817
{
    public static void main(String[] args)
    {
	Instant time1 = Instant.now();
	Instant.now().plusSeconds(60*60);
	final Clock clock = Clock.systemUTC();
	Instant instant = clock.instant();
	out.println(instant);
    }
}
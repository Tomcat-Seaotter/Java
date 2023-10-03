import java.math.*;
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
import java.time.DateTimeException;
import static java.lang.System.*;

public class Test821
{	
    public static void main(String[] args)
    {
	ZoneId zone = ZoneId.of("America/Los_Angeles");
	LocalDateTime departure = LocalDateTime.of(2016,Month.JULY,20,19,30);
	ZoneId azone = ZoneId.of("Asia/Shanghai");
	LocalDateTime arrive = LocalDateTime.of(2016,Month.JULY,21,22,20);
	try
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
		String out1 = departure.format(format);
		out.printf("Leaving: %s (%s) %n",out1,zone);
		out1 = arrive.format(format);
		out.printf("Arriving: %s (%s)%n",out1,azone);
	}
	catch(DateTimeException exc)
	{
		out.printf("%s 不能被解析 %n",departure);
		throw exc;
	}
    }
}
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
import java.time.format.DateTimeParseException;
import static java.lang.System.*;

public class Test820
{	
    public static void main(String[] args)
    {
	String str = "2018-07-09";
	LocalDate date = LocalDate.parse(str);
	String str1 = "20180709";
	date = LocalDate.parse(str1,DateTimeFormatter.BASIC_ISO_DATE);
	String str2 = "2018-08-31";
	try
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		date = LocalDate.parse(str2,format);
		out.printf("%s%n",date);
	}
	catch(DateTimeParseException exc)
	{
		out.printf("%s 不能被解析!%n",str2);
		throw exc;
	}
    }
}
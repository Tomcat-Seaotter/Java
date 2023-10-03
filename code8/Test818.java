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

public class Test818
{
	public static int[] bubble(int[] a)
	{
		int t;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[j]<a[j-1])
				{
					t = a[j-1];
					a[j-1]=a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

	public static int[] select(int[] a)
	{
		int k,t;
		for(int i=0;i<a.length-1;i++)
		{
			k=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[k]>a[j])
				{
					k=j;
				}
			}
			if(i!=k)
			{
				t = a[k];
				a[k]=a[i];
				a[i] = t;
			}
		}
		return a;
	}

	public static int[] insert(int[] a)
	{
		int i,j,k,t;
		i=1;
		while(i<a.length)
		{
			t=a[i];
			j=i-1;
			while(j>=0 && t<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
			i++;
		}
		return a;
	}
    public static void main(String[] args)
    {
    	Instant start,end;
    	Duration timeElapsed;
    	long millis;
    	int[] array = new int[100];
    	int[] b;
		for(int i=0;i<100;i++)
		{
			array[i]=100-i;
			out.print(array[i]+"\t");
		}
	start = Instant.now();
	b= bubble(array);
	end = Instant.now();
	timeElapsed = Duration.between(start,end);
	millis = timeElapsed.toMillis();
	out.println(millis);
	start = Instant.now();
	b= select(array);
	end = Instant.now();
	timeElapsed = Duration.between(start,end);
	millis = timeElapsed.toMillis();
	out.println(millis);
	start = Instant.now();
	b= insert(array);
	end = Instant.now();
	timeElapsed = Duration.between(start,end);
	millis = timeElapsed.toMillis();
	out.println(millis);
	for(int d: b)
	{out.print(d+"\t");}
    }
}
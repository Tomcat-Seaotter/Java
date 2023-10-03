import java.math.*;
import java.util.Scanner;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.LocalDate;
import static java.lang.System.*;

public class Test814
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        out.println("请输入一个年份、月份");
        int year = sc.nextInt();
        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,1);
        String monthName = date.getMonth().getDisplayName(TextStyle.FULL,Locale.getDefault());
        int dayOfMonth = date.lengthOfMonth();
        out.println(year+ "年           " + monthName);
        out.println("----------------------------------");
        out.printf("%4s%4s%4s%4s%4s%4s%4s%n","一","二","三","四","五","六","日");
        int dayOfWeek = date.getDayOfWeek().getValue();
        for(int i=2;i<=dayOfWeek;i++)
        {
            out.printf("%5s"," ");
        }
        for(int i=1;i<dayOfMonth;i++)
        {
            out.printf("%5d",i);
            if((dayOfWeek+i-1)%7==0)
                out.println();
        }
    }
}
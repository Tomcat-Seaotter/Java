import java.util.*;
import java.lang.*;
public class Lesson5
{
	public static void main(String[] args)
	{
		long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
         
		long currentSecond = totalSeconds % 60;
         
        //求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
         
        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
         
        //显示时间
        System.out.println("当前时间: " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}
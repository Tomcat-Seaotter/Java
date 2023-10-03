import java.util.*;
public class Lesson7
{
	public static void main(String[] args)
	{
		String date1;
		int year, month, days;
		days = 0;
		Scanner sc = new Scanner(System.in);
		date1 = sc.next();
		String[] str = date1.split("年");
		year = Integer.parseInt(str[0].substring(0,4));
		String[] str1 = str[1].split("月");
		month = Integer.parseInt(str1[0]);
		switch (month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
			 	break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
			    if ((year%4==0 && year%100!=0)||(year%400==0))
			    {
			    	days = 29;
			    }
			    else
			    {
			    	days =28;
			    }
				break;

		}
 		
		System.out.print(year + "年" + month + "月" + days +"天\n");
	}
}
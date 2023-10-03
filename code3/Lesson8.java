import java.util.*;
public class Lesson8
{
	public static void main(String[] args)
	{
		String animal = null;
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		switch (year%12)
		{
			case 4:
				animal = "鼠";
				break;
			case 5:
				animal = "牛";
				break;
			case 6:
				animal = "虎";
				break;
			case 7:
				animal = "兔";
				break;
			case 8:
				animal = "龙";
				break;
			case 9:
				animal = "蛇";
				break;
			case 10:
				animal = "马";
				break;
			case 11:
				animal = "羊";
				break;
			case 0:
				animal = "猴";
				break;
			case 1:
				animal = "鸡";
				break;
			case 2:
				animal = "狗";
				break;
			case 3:
				animal = "猪";
				break;
		}
 		
		System.out.print(year + "年属" + animal +"\n");
	}
}
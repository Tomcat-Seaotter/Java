import java.util.*;
public class Lesson15
{
	public static void main(String[] args)
	{
		int rooster, rabbit;
		rooster = 0;
		while(rooster<=50)
		{
			if(rooster*2+(40-rooster)*4==100)
				System.out.print("rooster = " + rooster + " rabbit = " + (40-rooster));		
			rooster++;
		}
	}
}
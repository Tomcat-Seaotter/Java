import java.util.*;

public class Lesson87
{
	public static char getUpperLetter()
	{
		return (char)(65+Math.random()*26);
	}
	public static char getLowerLetter()
	{
		return (char)(97+Math.random()*26);
	}
	public static char getDigit()
	{
		return (char)(48+Math.random()*10);
	}

	public static void main(String[] args)
	{
	for(int i=1;i<=100;i++)
		{
			System.out.print(getLowerLetter()+" ");
			if(i%20==0)
				System.out.print("\n");
		}
	for(int i=1;i<=100;i++)
		{
			System.out.print(getUpperLetter()+" ");
			if(i%20==0)
				System.out.print("\n");
		}
	for(int i=1;i<=100;i++)
		{
			System.out.print(getDigit()+" ");
			if(i%20==0)
				System.out.print("\n");
		}
	}
	
}
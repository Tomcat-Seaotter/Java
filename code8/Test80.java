import static java.lang.System.*;

public class Test80
{
	public static char toUpperLetter()
	{
		return (char)(65+Math.random()*26);
	}
	public static char toLowerLetter()
	{
		return (char)(97+Math.random()*26);
	}
	public static char toNumber()
	{
		return (char)(48+Math.random()*10);
	}

	public static void main(String[] args)
	{
		for(int i=1;i<=30;i++)
		{
			if(i%3==1)
			{
				out.print(toUpperLetter()+" ");
			}
			else if(i%3==2)
			{
				out.print(toLowerLetter()+" ");
			}
			else if(i%3==0)
			{
				out.print(toNumber()+" ");
			}
			if(i%10==0)
			{
				out.print("\n");
			}
		}
	}
}
import java.util.Scanner;

class Lesson610
{
	public static void main(String[] args)
	{
		int max;
	    if(Integer.parseInt(args[0])<Integer.parseInt(args[1]))
	    {
	    	max = Integer.parseInt(args[1]);
	    	if(max<Integer.parseInt(args[2]))
	    	{
	    		max = Integer.parseInt(args[2]);
	    	}
	    }
	    else
	    {
	    	max = Integer.parseInt(args[0]);
	    	if(max<Integer.parseInt(args[2]))
	    	{
	    		max = Integer.parseInt(args[2]);
	    	}
	    }

	    System.out.print("max="+max+"\n");
	}

}
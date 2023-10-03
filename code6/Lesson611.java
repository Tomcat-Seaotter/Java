import java.util.Scanner;

class Lesson611
{
	public static void main(String[] args)
	{
		String temp;
	    int i,j;
	    for(i=0;i<args.length-1;i++)
	    	for(j=i+1;j<args.length;j++)
	    	{
	    		if(args[j-1].compareTo(args[j])>0)
	    		{
	    			temp = args[j-1];
	    			args[j-1]=args[j];
	    			args[j]=temp;
	    		}
	    	}

	    for(i=0;i<args.length;i++)
	    {
	    	System.out.print(args[i]+"\t");
	    }
	}
}
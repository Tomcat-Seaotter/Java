public class Test62
{
    public static void main(String[] args)
    {
    	String s1 = "There is a boy, a dog and a cat";
    	int i=0;
    	int step = 0;
    	int s=0;
    	while(i<s1.length())
    	{
    		step = s1.indexOf('a',step);
    		System.out.print(step+"\t");
    		if(step!=-1)
    		{
    			s++;
    			step++;
    			i+=step;
    		}
    		else
    		{
    			break;
    		}

    	}
    	System.out.print(s);
    }
}
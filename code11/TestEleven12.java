import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class TestEleven12
{
	public static void main(String[] args)
	{
		int time =10;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = time;i>0;i--)
		{
			queue.add(i);
		}
		while(!queue.isEmpty())
		{
			out.println(queue.remove());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
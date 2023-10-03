import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.ArrayDeque;

public class TestEleven11
{
	public static void main(String[] args)
	{
		int[] e = {1,2,3,0,7,8,9};
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.addFirst(5);
		for(int i=0;i<3;i++)
		{
			queue.addFirst(e[i]);
		}
		for(int i=4;i<7;i++)
		{
			queue.offerLast(e[i]);
		}
		for(Integer v:queue)
		{
			out.print(v+" ");
		}
		out.println("\nsize = "+queue.size());
	}
}
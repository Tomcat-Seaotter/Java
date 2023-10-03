import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;


public class TestEleven7
{
	public static void main(String[] args)
	{
	List<String> p1 = new ArrayList<String>();
	p1.add("cat");
	p1.add("dog");
	p1.add("horse");
	for(String p:p1)
	{
		out.println(p+" ");
	}
	String[] p2 = {"tiger","lion"};
	Collection<String> p3 = new ArrayList<>();
	p3.add(p2[0]);
	p3.add(p2[1]);
	p1.addAll(p3);
	out.println(p3);
	Iterator<String> iter = p1.iterator();
	while(iter.hasNext())
	{
		String pet = iter.next();
		out.println(pet);
	}
	}
}
import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;

public class TestEleven8
{
	public static void main(String[] args)
	{
	String[] p2 = {"tiger","lion"};
	List<String> p3 = Arrays.asList(p2);
	Iterator<String> iter = p3.iterator();
	while(iter.hasNext())
	{
		String pet = iter.next();
		out.println(pet);
	}
	}
}
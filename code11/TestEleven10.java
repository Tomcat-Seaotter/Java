import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class TestEleven10
{
	public static void main(String[] args)
	{
		String[] s= {"china","england","france","america","russia"};
		Set<String> ts = new TreeSet<>();
		for(int i=0;i<s.length;i++)
		{
			ts.add(s[i]);
		}
		out.println(ts);
		ts = new TreeSet<>((String s1,String s2)->s2.compareTo(s1));//内部类
		for(int i=0;i<s.length;i++)
		{
			ts.add(s[i]);
		}
		out.println(ts);
	}
}
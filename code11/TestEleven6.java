import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;


public class TestEleven6
{
	public static double getAverage(List<? extends Number> list)
	{
		double total =0.0;
		for(Number number:list)
		{
			total+=number.doubleValue();
		}
		return total/list.size();
	}

	public static void main(String[] args)
	{
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(3);
	list1.add(30);
	list1.add(300);
	out.println(getAverage(list1));
	List<Double> list2 = new ArrayList<Double>();
	list2.add(5.5);
	list2.add(55.5);
	out.println(getAverage(list2));
	}
}
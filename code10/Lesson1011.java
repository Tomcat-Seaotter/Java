import java.util.Arrays;
import java.util.Comparator;

class Lesson1011
{
	public static void main(String[] args)
	{
		Integer[] c = {1,56,3,2,12};
		// Arrays.sort(a, new Comparator<Integer>()
		// {
		// 	public int compare(Integer a, Integer b)
		// 	{
		// 		return a-b;
		// 	}
		// }
		// );
		// Arrays.sort(c, (Integer a, Integer b)->
		// 	{
		// 		return a-b;
		// 	}
		// );
		Arrays.sort(c, (Integer a, Integer b)-> b-a);
		for (int c1:c)
		{
			System.out.print(c1+"\t");
		}
	}
}
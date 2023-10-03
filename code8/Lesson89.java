import java.util.*;

public class Lesson89
{

	public static void main(String[] args)
	{
		boolean a = true;
		Boolean b =  new Boolean("True");
		Boolean c = new Boolean("Yes");
		Boolean d = new Boolean("中");
		Integer e = new Integer(31);
		Integer f = new Integer("12");
		Integer value = 308; //autoboxing
		int x = value; //unboxing
		System.out.print(Boolean.parseBoolean("T1rue")+"\n");
		System.out.print(Integer.toBinaryString(35)+"\n");
		System.out.print(Integer.toHexString(35)+"\n");
		System.out.print(Integer.toOctalString(35)+"\n");
		System.out.print(Integer.highestOneBit(35)+"\n");
		System.out.print(Integer.lowestOneBit(35)+"\n");
		System.out.print(Integer.reverse(35)+"\n");
		System.out.print(Integer.signum(-35)+"\n");
		System.out.print(Integer.SIZE+"\n");
		System.out.print(Integer.BYTES+"\n");
		System.out.print(Integer.MAX_VALUE+"\n");
		System.out.print(Integer.MIN_VALUE+"\n");
		System.out.print(((Object)x).toString()+"\n");
	}
	
}
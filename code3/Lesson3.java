import java.util.*;
public class Lesson3
{
	public static void main(String[] args)
	{
		int a1, a2, a3, a4, min, max, min1, max1;
		Scanner sc = new Scanner(System.in);
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		a4 = sc.nextInt();
		min = a1;
		max = a1;
		max = ((a1+a2)+Math.abs(a1-a2))/2;
		max1 = ((a3+a4)+Math.abs(a3-a4))/2;
		max = ((max+max1)+Math.abs(max1-max))/2;
		min = ((a1+a2)-Math.abs(a1-a2))/2;
		min1 = ((a3+a4)-Math.abs(a3-a4))/2;
		min = ((min+min1)-Math.abs(min1-min))/2;
		System.out.print("max = " + max + "\n");
		System.out.print("min = " + min);
	}
}
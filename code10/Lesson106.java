import java.util.Arrays;

public class Lesson106
{
	public static void main(String[] args)
	{
		Circle[] circles = new Circle[]
		{
			new Circle(3.4),new Circle(2.5),new Circle(5.8),
		};
		System.out.println(circles[0].compareTo(circles[1]));
		Arrays.sort(circles);
		for (Circle c:circles)
		{
			System.out.printf("%6.2f%n",c.getArea());
		}
	}
}
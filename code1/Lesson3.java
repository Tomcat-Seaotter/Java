import java.util.*;
import java.lang.*;
public class Lesson3
{
	public static void main(String[] args)
	{
		double area, circumference,radius;
		radius = 5.5;
		area = Math.PI*radius*radius;
		circumference = 2*Math.PI*radius;
		System.out.format("area = %.5f \n", area);
		System.out.format("circumference = %.5f", circumference);
	}
}
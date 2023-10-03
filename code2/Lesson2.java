import java.util.*;
import java.lang.*;
public class Lesson2
{
	public static void main(String[] args)
	{
		double radius,height,volumn;
  		Scanner sc = new Scanner(System.in);
  		radius = sc.nextDouble();
  		height = sc.nextDouble();
		volumn = Math.PI*radius*radius*height;
		System.out.format("volumn = %.2f \n", volumn);
	}
}
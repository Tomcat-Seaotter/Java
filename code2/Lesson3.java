import java.util.*;
import java.lang.*;
public class Lesson3
{
	public static void main(String[] args)
	{
		double weight,height,bmi;
  		Scanner sc = new Scanner(System.in);
  		weight = sc.nextDouble();
  		height = sc.nextDouble();
		bmi = weight/(height*height);
		if(bmi<=18.4)
		{
			System.out.format("偏瘦\n");
		}
		else if(bmi<=23.9)
		{
			System.out.format("偏瘦\n");
		}
		else if(bmi<=27.9)
		{
			System.out.format("过重\n");
		}
		else
		{
			System.out.format("肥胖\n");
		}
	}
}
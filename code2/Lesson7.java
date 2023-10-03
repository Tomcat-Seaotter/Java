import java.util.*;
import java.lang.*;
public class Lesson7
{
	public static void main(String[] args)
	{
                double rate,money,year;
                double month;
                Scanner sc = new Scanner(System.in);
                rate = sc.nextDouble();
                money = sc.nextDouble();
                year = sc.nextDouble();
                month = (money*(rate/12))/(1-(1/Math.pow((1+rate/12),(year*12))));        
                System.out.format("month= %4.2f\n", month);
                System.out.format("total money= %4.2f" , (month*12*year));
	}
}
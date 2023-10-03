import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
    double year_rate,total,years,d;
    Scanner sc = new Scanner(System.in);
    year_rate = sc.nextDouble();
    total = sc.nextDouble();
    years = sc.nextDouble();
    d = (total*(year_rate/12))/(1-(1/Math.pow((1+year_rate/12),years*12)));
    System.out.print("月支付金额="+d+"\n");
    System.out.print("总偿还金额"+(d*12*years)+"\n");
    }
}
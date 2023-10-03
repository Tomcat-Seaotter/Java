import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
    double a,b,c,d;
    Scanner sc = new Scanner(System.in);
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    assert a==b;
    d = (-b+(Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
    System.out.print("d="+d+"\n");
    }
}
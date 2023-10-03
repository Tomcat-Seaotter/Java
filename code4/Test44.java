import java.util.Scanner;

public class Test44
{
  public static int fun(int n)
  {
    int product;
    if(n==1)
    {
        product=1;
    }
    else
    {
        product=n*fun(n-1);
    }
    return product;
  }
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.print(fun(a)+"\n");
  }   
}
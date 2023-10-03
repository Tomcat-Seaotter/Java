import java.util.Scanner;
public class Test65
{
  public static String toBinary(int n)
  {
    String binary = "";
    int reminder = 0;
    while(n!=0)
    {
      reminder = n%2;
      binary=reminder+binary;
      n/=2;
    }
    return binary;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    String b = toBinary(v);
    System.out.print(b+"\n");   
  }   
}
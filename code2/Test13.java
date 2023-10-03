import java.util.Scanner;

public class Test13
{
    public static void main(String[] args)
    {
    int number,reminder;
    String binary = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入十进制数字\n");
    number = sc.nextInt();
    while(number!=0)
    {
        reminder = number%2;
        binary=reminder+binary;
        number/=2;
    }
    System.out.print("binary="+binary+"\n");
    }
}
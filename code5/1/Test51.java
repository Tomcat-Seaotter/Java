import java.util.Scanner;
public class Test51
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组元素\n");
        for(int i=0;i<=array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("输入元素结束！\n");
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }


    }
}
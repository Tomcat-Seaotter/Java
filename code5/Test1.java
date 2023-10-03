import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Test1
{
        public static int[] bubble(int[] a)
        {
            int t;
            for(int i=a.length-1;i>0;i--)
            {
                for(int j=0;j<i;j++)
                {
                    if(a[j+1]<a[j])
                    {
                        t = a[j];
                        a[j]=a[j+1];
                        a[j+1] =t;
                    }
                }
            }
            return a;
        }

    public static void main(String[] args)
    {
        int[] array = new int[5];
        for(int i=0;i<5;i++)
        {
            array[i] = (int)(Math.random()*101-50);
        }
        array = bubble(array);
        for(int i=0;i<5;i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
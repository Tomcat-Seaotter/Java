import java.util.Scanner;
public class Test54
{
    public static int maxint(int[] array)
    {
        int m = array[0];
        for(int i: array)
        {
            if(m<i)
            {
                m=i;
            }
        }
        return m;
    }
    public static int minint(int[] array)
    {
        int mi = array[0];
        for(int i: array)
        {
            if(mi>i)
            {
                mi=i;
            }
        }
        return mi;
    }
    public static int cumsum(int[] array)
    {
        int csum =0;
        for(int i: array)
        {
            csum+=i;
        }
        return csum;
    }
    public static int[] reverse(int[] array)
    {
        int[] temp =new int[array.length];
        for(int i= array.length-1;i>=0;i--)
        {
            temp[array.length-i-1] = array[i];
        }
        return temp;
    }

    public static double average(int ... valuse)
    {
        double sumint = 0;
        for(int i: valuse)
        {
            sumint+=i;
        }
        return sumint/valuse.length;
    }

    public static void main(String[] args)
    {
        int[] array1= new int[]{1,2,3,4,5};
        int[] array2= new int[]{11,12,13,14,15};
        int[] array3= new int[]{31,32,33};
        int[] array4 = reverse(array3);
        System.out.print(maxint(array1)+"\n");
        System.out.print(minint(array2)+"\n");
        System.out.print(cumsum(array3)+"\n");
        for(int i: array4)
        {
            System.out.print(i+"\t");
        }
        System.out.print("\n"+average(3,4,5,111)+"\n");
    }
}
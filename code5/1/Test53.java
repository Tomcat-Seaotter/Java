import java.util.Scanner;
public class Test53
{
    public static void main(String[] args)
    {
        int[] array1= new int[]{1,2,3,4,5};
        int[] a = new int[5];
        int[] b = {1,33,44};
        int[] array2= new int[]{11,12,13,14,15};
        int[] array3= new int[]{31,32,33};
        try
        {
            System.arraycopy(array1,0,array2,0,array1.length);
            System.arraycopy(array1,0,array3,0,2);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print(e+"\n");
        }
        for(int i :array2)
        {
            System.out.print(i+"\t");
        }
        for(int i :array3)
        {
            System.out.print(i+"\t");
        }

    }
}
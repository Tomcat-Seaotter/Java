import java.util.Scanner;

public class Test56
{
  public static int[] sumArray(int[] a, int[] b)
  {
    int i,min;
    min = (a.length<b.length)?a.length:b.length;
    int[] array = new int[(a.length>b.length)?a.length:b.length];
    for(i=0;i<min;i++)
    {
      array[i]=a[i]+b[i];
    }
    if(a.length>b.length)
    {
      while(i<a.length)
      {
        array[i]=a[i];
        i++;
      }
    }
    else
    {
      while(i<b.length)
      {
        array[i]=b[i];
        i++;
      }
    }
    return array;
  }

  public static int[][] productArray(int[][] a, int[][] b)
  {
    int row = a.length;
    int column = b[0].length;
    int[][] result = new int[row][column];
    int i,j,k;
    for(i=0;i<row;i++)
    {
      for(j=0;j<b[0].length;j++)
      {
        for(k=0;k<a[0].length;k++)
        {
        result[i][j]+=a[i][k]*b[k][j];
        }
      }
    }
    return result;
    
  }
  public static void main(String[] args)
  {
    int i,j;
    int[] a = {1,2,4};
    int[] b = {2,4,6,8};
    int[] c = sumArray(a,b);
    for(i=0;i<c.length;i++)
    {
      System.out.print(c[i]+"\t");
    }
      System.out.print("\n");
    int[][] x = {{1,2,3},{2,3,1},{8,0,1}};
    int[][] y = {{1,0,1,4},{1,1,3,5},{3,4,2,6}};
    int[][] z = productArray(x,y);
    for(i=0;i<z.length;i++)
    {
      for(j=0;j<z[0].length;j++)
      {
        System.out.print(z[i][j]+"\t");
      }
      System.out.print("\n");
    }
  }   
}
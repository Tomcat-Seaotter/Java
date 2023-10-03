import java.util.Scanner;
public class Test57
{
  public static void main(String[] args)
  {
    int[] p = new int[12];
    int i,k,n;
    i = 0;
    while(i<12)
    {
      p[i] = i+1;
      System.out.print(p[i]+"\t");
      i++;
    }
    System.out.print("\n");
    n=k=0;
    while(true)
    {
      i=0;
      while(i<12)
      {
        if(p[i]!=0)
        {
          k++;
          if(k%5==0)
          {
            p[i]=0;
            System.out.print("p["+(i+1)+"]\n");
            n++;
          }
        }
        i++;
      }
      if(n==11) break;
    }
    i=0;
    while(i<12)
    {
      if(p[i]!=0)
      {
        System.out.print("最后的元素是p["+(i+1)+"]\n");
      }
      i++;
    }
  }   
}
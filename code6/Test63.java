import java.util.Scanner;
public class Test63
{
  public static boolean isbnvalid(int[] n)
  {
    boolean flag;
    int sum,k,m;
    sum= n[0]*1+n[1]*3+n[2]*1+n[3]*3+n[4]*1+n[5]*3+n[6]*1+n[7]*3+n[8]*1+n[9]*3+n[10]*1+n[11]*3;
    k = sum%10;
    m = 10-k;
    if(m==10) m=0;
    if(m==n[12])
    {
      flag = true;
    }
    else
    {
      flag = false;
    }
    return flag;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String isbn = sc.nextLine();
    int[] number = new int[13];
    int i,j;
    boolean flag;
    i=j=0;
    while(i<isbn.length())
    {
      if(isbn.charAt(i)!='-')
      {
          number[j]=isbn.charAt(i)-48;
          j++;
      }
      i++;
    }
    flag = isbnvalid(number);
    if(flag)
    {
      System.out.print("ISBN is valid\n");
    }
    else
    {
      System.out.print("ISBN is invalid\n");
    }
      
  }   
}
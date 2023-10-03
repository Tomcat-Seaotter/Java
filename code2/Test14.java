import java.util.Scanner;

public class Test14
{
  public static void main(String[] args)
  {
      int chicken, rabbit;
      chicken = 0;
      for(rabbit=0;rabbit<=25;rabbit++)
      {
        chicken = 40 -rabbit;
        if(chicken*2+rabbit*4==100)
        {
            break;
        }
      }
      System.out.print("ckicken = "+chicken + "   rabbit="+rabbit+"\n");
  }   
}
import java.util.*;
public class Lesson9
{
	public static void main(String[] args)
	{
		int computer, num;
		Scanner sc = new Scanner(System.in);
		computer = (int)(3*Math.random())%3;
		System.out.print("你出什么？（石头（2）、剪刀（1）、布（0））：");
		num = sc.nextInt();
		if(num==2 && computer==1)
		{
			System.out.print("计算机出的是：剪刀，你出石头，你赢了");
		}
		if(num==1 && computer==0)
		{
			System.out.print("计算机出的是：布，你出剪刀，你赢了");
		}
		if(num==0 && computer==2)
		{
			System.out.print("计算机出的是：石头，你出布，你赢了");
		}
		if(num==1 && computer==2)
		{
			System.out.print("计算机出的是：石头，你出剪刀，你输了");
		}
		if(num==0 && computer==1)
		{
			System.out.print("计算机出的是：剪刀，你出布，你输了");
		}
		if(num==2 && computer==0)
		{
			System.out.print("计算机出的是：布，你出石头，你输了");
		}

	}
}
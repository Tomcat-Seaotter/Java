import java.math.*;

//anonymous inner class


class boy
{
	public void play()
	{
		System.out.print("basketball play \n");	
	}
}

public class Lesson93
{

	public static void main(String[] args)
	{
		boy b = new boy(){
			public void play()
			{
				//赋给引用变量
				System.out.print("football play \n");	
			}
		};
		boy b1 = new boy();
		b.play();
		b1.play();
	}
}
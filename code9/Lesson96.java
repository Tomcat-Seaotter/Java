import java.math.*;

//静态内部类
enum Direction
{
	EAST, SOUTH, WEST, NORTH;
}

public class Lesson96
{
	public static void main(String[] args)
	{
		Direction left = Direction.WEST;
		System.out.print(left+"\n");
		for(Direction d: Direction.values())
		{
			//System.out.print(d.name()+", num"+d.ordinal()+"\n");
			System.out.print(d.valueOf("SOUTH")+"\n");
			System.out.print(d.name()+"\n");
			System.out.print(d.toString()+"\n");
		}
	}
}
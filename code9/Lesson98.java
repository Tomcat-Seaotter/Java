import java.time.DayOfWeek;

//静态内部类

enum Color
{
	RED("RED",1),GREEN("GREEN",2),WHITE("WHITE",3),YELLOW("YELLOW",4);
	private String name;
	private int index;
	private Color(String name,int index)
	{
		this.name=name;
		this.index=index;
	}

	public static String getName(int index)
	{
		for (Color c:Color.values())
		{
			if(c.getIndex()==index)
			{
				return c.name;
			}
		}
		return null;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getIndex()
	{
		return index;
	}
	public void setIndex()
	{
		this.index=index;
	}

	public String toString()
	{
		return this.index+"--"+this.name;
	}
}
public class Lesson98
{
	public static void main(String[] args)
	{
		Color c = Color.RED;
		System.out.print(c.toString());
	}
}
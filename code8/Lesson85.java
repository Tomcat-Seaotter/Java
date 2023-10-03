import java.util.*;

class car implements Cloneable
{
	private int id;
	private String brand;
	car(int id, String brand)
	{
	this.id=id;
	this.brand=brand;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof car)
		{
			if(this==obj)
			{
				return true;
			}
			else if(this.id==((car)obj).id && this.brand==((car)obj).brand)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		return Objects.hash(id,brand);
	}

	protected Object clone()
	{
		return this;
	}

	protected void finalize() throws Throwable
	{
		System.out.print("The object is destroyed"+"\n");
	}
}

public class Lesson85
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
	car c1 = new car(12,"QQ");
	car c2 = new car(13,"ford");
	c1 = null;
	c2 = null;
	System.gc();
	}
}
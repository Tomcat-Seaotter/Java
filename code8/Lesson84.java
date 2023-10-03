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
}

public class Lesson84
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
	car c1 = new car(12,"QQ");
	car c2 = (car)c1.clone();
	System.out.print((c1 == c2)+"\n");
	System.out.print(c1.equals(c2)+"\n");
	System.out.print(c1.getClass().getName()+"\n");
	System.out.print(c1.hashCode()+"\n");
	System.out.print(c1+"\n");

	}
}
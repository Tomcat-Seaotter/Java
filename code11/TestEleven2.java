import static java.lang.System.*;

class Point<T>
{
	private T x;
	private T y;
	Point(T x, T y)
	{
		this.x=x;
		this.y=y;
	}
	Point()
	{

	}
	public T getX()
	{
		return this.x;
	}
	public T getY()
	{
		return this.y;
	}
	public void setT(T x)
	{
		this.x=x;
	}
	public void setY(T y)
	{
		this.y=y;
	}
}

public class TestEleven2
{
	public static void main(String[] args)
	{
	Point p = new Point(new Double(2.0),new Double(3.0));
	out.println(p.getX());
	out.println(p.getY());
	Point<Integer> p1 = new Point(new Integer(12),new Integer(4));
	out.println(p1.getX());
	out.println(p1.getY());
	}
}
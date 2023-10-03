class Rectangle
{
	private double length;
	private double width;
	
	Rectangle()
	{
		this.length = 1.0;
		this.width = 1.0;
	}

	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double getArea()
	{
		return this.length*this.width;
	}
	public double getPerimeter()
	{
		return 2*this.width*this.length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getWidth()
	{
		return this.width;
	}
}

class Lesson43
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Rectangle r1 =  new Rectangle(10,10);
		System.out.println(r.getPerimeter());
		System.out.println(r.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getArea());
	}
}
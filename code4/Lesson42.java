class Circle
{
	private double centerX;
	private double centerY;
	private double radius;

	Circle(double centerX, double centerY, double radius)
	{
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}
	Circle()
	{
		this.radius = 1.0;
	}
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	public double getPermeter()
	{
		return 2*Math.PI*this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
}

class Lesson42
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		Circle c1 =  new Circle(10,10,5);
		System.out.println(c.getPermeter());
		System.out.println(c.getArea());
		System.out.println(c1.getPermeter());
		System.out.println(c1.getArea());
	}
}
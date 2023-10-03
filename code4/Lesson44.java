class Triangle
{
	private double a;
	private double b;
	private double c;
	
	Triangle()
	{
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
	}

	Triangle(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea()
	{
		double s =  (this.a+this.b+this.c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

class Lesson44
{
	public static void main(String[] args)
	{
		Triangle r = new Triangle();
		Triangle r1 =  new Triangle(10,10,10);
		System.out.println(r.getArea());
		System.out.println(r1.getArea());
	}
}
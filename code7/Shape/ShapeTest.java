abstract class Shape
{
	private String type;
	Shape()
	{}
	Shape(String type)
	{this.type=type;}
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Square extends Shape
{
	private int width;
	private int height;
	Square(){}
	Square(String t, int width, int height)
	{
		super(t);
		this.width=width;
		this.height =height;
	}
	public double getArea()
	{
		return this.width*this.height;
	}
	public double getPerimeter()
	{
		return 2*(this.width+this.height);
	}
}
class Circle extends Shape
{
	private int radius;
	Circle(){}
	Circle(String t,int radius)
	{
		super(t);
		this.radius=radius;
	}
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	public double getPerimeter()
	{
		return 2*(Math.PI*this.radius);
	}
}

public class ShapeTest
{
	public static void main(String[] args)
	{
		Shape[] shape = new Shape[3];
		shape[0] = new Circle("Circle",2);
		shape[1] = new Square("Square",3,4);
		shape[2] = new Circle("Circle",3);
		for (Shape s: shape)
		{
			System.out.print(s.getPerimeter()+"\n");
			System.out.print(s.getArea()+"\n");
		}
	}
}

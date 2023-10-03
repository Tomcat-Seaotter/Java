class Square implements Comparable<Square>
{
	private double width;
	private double height;
	Square(double w, double h)
	{
		this.width=w;
		this.height=h;
	}
	public double getPerimeter()
	{
		return 2*this.width*this.height;
	}
	public double getArea()
	{
		return this.width*this.height;
	}

	public int compareTo(Square s)
	{
		if(this.getArea()>s.getArea())
		{
			return 1;
		}
		else if (this.getArea()<s.getArea())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
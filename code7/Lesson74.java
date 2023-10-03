class Lesson74
{
	public static void main(String[] args)
	{
		Shape[] s = new Shape[4];
		s[0] = new Rectangle(3,4);
		s[1] = new Circle(3);
		s[2] = new Rectangle(12,2);
		s[3] = new Circle(2);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i].getArea()+"\n");
		}
	}
}
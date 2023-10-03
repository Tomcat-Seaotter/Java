import java.util.Arrays;

class Lesson107
{
	public static void main(String[] args)
	{
		Square[] s = new Square[4];
		s[0] = new Square(3,4);
		s[1] = new Square(2,5);
		s[2] = new Square(5,5);
		s[3] = new Square(10,8);
		for(Square c:s)
		{
			System.out.print(c.compareTo(s[0])+"\t");
		}
		Arrays.sort(s);
		for (Square c:s)
		{
			System.out.printf("\n %6.2f%n",c.getArea());
		}
	}
}
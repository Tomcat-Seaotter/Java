import java.util.Arrays;

class Rectangle implements Comparable<Rectangle>{

	private int w;
	private int h;
	Rectangle(int w, int h)
	{
		this.w=w;
		this.h=h;
	}
    public int area()
    {
    	return this.w*this.h;
    }
    public int length()
    {
    	return (this.w+this.h)*2;
    }
    public int compareTo(Rectangle c1)
    {
    	return c1.area()-c2.area();
    }
}

import java.util.Arrays;
import java.util.Comparator;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] r1  = new Rectangle[3];
		r1[0] = new Rectangle(1,1);
		r1[1] = new Rectangle(2,2);
		r1[2] = new Rectangle(3,3);
		Arrays.sort(r1); //加一个Rectangle类
		for(Rectangle r: r1)
		{
			System.out.println(r.area());
		}
	}

}
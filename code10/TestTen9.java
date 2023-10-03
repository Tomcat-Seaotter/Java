import static java.lang.System.*;
import java.util.Arrays;
import java.util.Comparator;

class Rectangle
{
    private int width;
    private int height;
    Rectangle(int w, int h)
    {
        this.width=w;
        this.height=h;
    }
    public int getArea()
    {
        return this.width*this.height;
    }
}

class RectangleComparator implements Comparator<Rectangle>
{
    public int compare(Rectangle a, Rectangle b)
    {
        return a.getArea()-b.getArea();
    }
}

public class TestTen9
{
    public static void main(String[] args)
    {
        Rectangle[] r = new Rectangle[]{new Rectangle(2,3),new Rectangle(4,5),new Rectangle(5,9)};
        Arrays.sort(r,new RectangleComparator());
        for (Rectangle a:r)
        {
            out.print(a.getArea()+"\t\n");
        }
    }
}
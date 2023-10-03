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

public class TestTen10
{
    public static void main(String[] args)
    {
        Rectangle[] r = new Rectangle[]{new Rectangle(2,3),new Rectangle(4,5),new Rectangle(5,9)};
        Arrays.sort(r,new Comparator<Rectangle>(){
            public int compare(Rectangle a, Rectangle b)
            {
                    return a.getArea()-b.getArea();
            }
        });//匿名内部类
        for (Rectangle a:r)
        {
            out.print(a.getArea()+"\t\n");
        }
    }
}
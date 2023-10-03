import static java.lang.System.*;
import java.util.Arrays;

class Circle implements Comparable<Circle>
{
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*this.radius;
    }
    public int compareTo(Circle c)
    {
        if(this.getArea()>c.getArea())
        {
            return 1;
        }
        else if(this.getArea()<c.getArea())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}


public class TestTen8
{
    public static void main(String[] args)
    {
        Circle[] carray = new Circle[]{new Circle(1),new Circle(3),new Circle(23)};
        Arrays.sort(carray);
        for (Circle a:carray)
        {
            out.print(a.getArea()+"\t"+a.getPerimeter()+"\n");
        }

    }
}
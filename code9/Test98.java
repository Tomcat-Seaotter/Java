import static java.lang.System.*;
import java.time.DayOfWeek;

enum Color
{
    RED("red",1),
    GREEN("green",2),
    WHITE("white",3),
    YELLOW("yellow",4),
    BLUE("blue",4);

    private String colorname;
    private int index;

    private Color(String n, int i)
    {
        this.colorname=n;
        this.index=i;
    }
    public static String getname(int index)
    {
        for(Color c: Color.values())
        {
            if(c.getIndex()==index)
            {
                return c.colorname;
            }
        }
        return null;
    }

    public String getName()
    {
        return this.colorname;
    }
    public void setName(String name)
    {
        this.colorname=name;
    }
    public int getIndex()
    {
        return index;
    }
    public void setIndex(int index)
    {
        this.index=index;
    }
    public String toString()
    {
        return this.index + "---" + this.colorname;
    }

}

public class Test98
{
public static void main(String[] aegs)
{
        Color c = Color.RED;
        Color d = Color.BLUE;
        out.println(c.toString());
        out.println(d.toString());
}
}
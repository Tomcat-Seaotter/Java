import static java.lang.System.*;

enum direction
{
    EAST,NORTH,WEST,SOUTH;
    void show(int i)
    {
        switch(i)
        {
            case 1:
            out.println(direction.EAST);
            break;
            case 2:
            out.println(direction.NORTH);
            break;
            case 3:
            out.println(direction.WEST);
            break;
            case 4:
            out.println(direction.SOUTH);
            break;
        }
    }
}

public class Test96
{
public static void main(String[] args)
{
    direction d = direction.WEST;
    d.show(2);
    for(direction k: direction.values())
    {
        out.println(k.name() + " " + k.ordinal());
    }
    // try
    // {

    // }
    // catch()
    // {

    // }
}
}
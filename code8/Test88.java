import static java.lang.System.*;
public class Test88
{
    public static void main(String[] args)
    {
        Boolean a = new Boolean("True");
        Boolean b = new Boolean("False");
        Boolean c = new Boolean(true);
        out.println(a.booleanValue());
        out.println(Boolean.parseBoolean("Hello"));
        out.println(Boolean.valueOf(true));
        out.println(Boolean.valueOf("false"));
    }
}
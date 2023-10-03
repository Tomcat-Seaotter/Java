import static java.lang.System.*;
public class Test810
{
    public static void main(String[] args)
    {
        double d = 5.0/0.0;
        Double f  = 34.2;   //自动装箱
        double x = f;       //自动拆箱
        out.println(d);
        out.println(d==Double.POSITIVE_INFINITY);
        out.println(-5.0/0.0);
        out.println(0.0/0.0);
        out.println(f);
        out.println(x);
        out.println(f.toString());
        out.println(f.equals(f));
    }
}
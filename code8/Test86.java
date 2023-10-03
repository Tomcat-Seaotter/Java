import static java.lang.System.*;
public class Test86
{
    public static void main(String[] args)
    {
        Integer a = new Integer("23");
        Integer b = new Integer(12);
        out.println(Integer.toBinaryString(2));
        out.println(Integer.toHexString(14));
        out.println(Integer.toOctalString(12));
        out.println(Integer.highestOneBit(7));
        out.println(Integer.lowestOneBit(10));
        out.println(Integer.reverse(34));
        out.println(Integer.signum(34));
    }
}
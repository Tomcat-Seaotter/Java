import java.math.*;
import static java.lang.System.*;
public class Test811
{
    public static void main(String[] args)
    {
        BigInteger x = new BigInteger("10000000000");
        BigInteger y = x.multiply(new BigInteger("1022122222"));
        out.println(y);
        y = y.subtract(x);
        out.println(y);
        BigDecimal x1 = new BigDecimal("5");
        BigDecimal y1 = new BigDecimal("45");
        BigDecimal z1 = y1.divide(x1,20, BigDecimal.ROUND_HALF_UP);
        out.println(z1);
        
    }
}
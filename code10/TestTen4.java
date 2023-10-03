import static java.lang.System.*;

interface Voltage
{
    int chinavoltage =220;
    public final static int euro = 110;
    public int american = 110;
}


class Electronics implements Voltage
{
    String brand;
    double price;
    public String getBrand()
    {
        return this.brand;
    }
    public double getPrice()
    {
        return this.price;
    }
}


public class TestTen4
{
    public static void main(String[] args)
    {
        Electronics e1 = new Electronics();
        e1.brand = "Lenovo";
        e1.price = 2344;
        out.println(e1.getPrice());
        out.println(e1.getBrand());
        out.println(e1.american);
        out.println(e1.chinavoltage);
        out.println(e1.euro);
    }
}
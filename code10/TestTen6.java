import static java.lang.System.*;

interface Voltage
{
    int chinavoltage =220;
    public final static int eurovoltage = 110;
    public int americanvoltage = 110;
    public static void displayChinaVoltage()
    {
        out.println(chinavoltage);
    }
    public static void displayEuroVoltage()
    {
        out.println(eurovoltage);
    }
    public static void displayAmericaVoltage()
    {
        out.println(americanvoltage);
    }

    public default void print()
    {
        out.println("This is Voltage interface");
    }
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
    public void print()
    {
        out.println("This is Electronics");
    }
}


public class TestTen6
{
    public static void main(String[] args)
    {
        Electronics e1 = new Electronics();
        e1.brand = "Lenovo";
        e1.price = 2344;
        out.println(e1.getPrice());
        out.println(e1.getBrand());
        Voltage.displayAmericaVoltage();
        Voltage.displayEuroVoltage();
        Voltage.displayChinaVoltage();
        e1.print();
    }
}
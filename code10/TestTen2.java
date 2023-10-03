import static java.lang.System.*;

interface Person
{
    public abstract String getName();
}

interface Address
{
    public abstract String getAddress();

}

interface House extends Person, Address
{


}

class HouseA implements House
{
    String name;
    String address;
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
}


public class TestTen2
{
    public static void main(String[] args)
    {
        HouseA h = new HouseA();
        h.name = "Ningbo";
        h.address = "Fenghua";
        out.println(h.getName());
        out.println(h.getAddress());
    }
}
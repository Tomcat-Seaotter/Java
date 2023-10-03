import static java.lang.System.*;

interface Person
{
    public abstract String getName();

    public void run();   //error

}

interface Address
{
    public abstract String getAddress();

    public void display(); //error

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
    public void run()   
    {
        out.println("Person Run");
    }
    public void display()
    {
        out.println("Address");
    }
}


public class TestTen3
{
    public static void main(String[] args)
    {
        Person p = new HouseA();   //upCast
        Address a = new HouseA();
        HouseA h = new HouseA();
        h.name = "Ningbo";
        h.address = "Fenghua";
        p.run();
        out.println(p.getName());
        a.display();
        out.println(a.getAddress());
        out.println(h.getName());
        out.println(h.getAddress());
    }
}
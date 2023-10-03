import java.math.*;
import static java.lang.System.*;
abstract class Electronis
{
    String brand;
    int price;
    public abstract String getBrand();
    public abstract int getPrice();
}
class Phone extends Electronis
{
    String address;
    Phone(String b, int p ,String a)
    {
        this.brand =b;
        this.price =p;
        this.address =a;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public int getPrice()
    {
        return this.price;
    }
}
class Computer extends Electronis
{
    String address;
    Computer(String b, int p,String address)
    {
        this.brand =b;
        this.price =p;
        this.address =address;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public int getPrice()
    {
        return this.price;
    }
}
class Factory
{
    private static Electronis product;
    public static Electronis MakeProduct(String type, String n, int p, String address)
    {
        if(type.equals("Computer"))
        {
            product = new Computer(n,p,address);
        }
        if(type.equals("Phone"))
        {
            product = new Phone(n,p,address);
        }
        return product;
    }
}

public class Test812
{
    public static void main(String[] args)
    {
        Electronis p = Factory.MakeProduct("Computer","HuaWei",5500,"Shenzhen"); //new 
        out.println(p.getBrand());
        out.println(p.getPrice());
        p = Factory.MakeProduct("Phone","Oppo",4000,"Ningbo");
        out.println(p.getBrand());
        out.println(p.getPrice());
        
    }
}
import java.time.*;

class Person
{
    private String name;
    private LocalDate birthday;
    // private Address ad;
    Person()
    {

    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }
    public String getAddress()
    {
        class Address{
            String city;
            String street;
            Address(String c, String s)
            {
                this.city=c;
                this.street =s;
            }
            public String getAddress()
            {
                return this.city+ this.street;
            }
        }
        return new Address("Ningbo","Fenghua Road").getAddress();
        // return this.add.getAddress();
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setBirthday(LocalDate d)
    {
        this.birthday =d;
    }
    // public void setAddress(String c, String s)
    // {
    //     class Address{
    //         String city;
    //         String street;
    //         Address(String c, String s)
    //         {
    //             this.city=c;
    //             this.street =s;
    //         }
    //     }
    //     this.add = new Address(c,s);
    // }
}

public class Test91
{
public static void main(String[] aegs)
{
    Person p1 = new Person();
    p1.setName("Wanghai");
    p1.setBirthday(LocalDate.of(2001,Month.SEPTEMBER,3));
    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    System.out.print(p1.getAddress());
}
}
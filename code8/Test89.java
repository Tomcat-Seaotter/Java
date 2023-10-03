import java.time.*;
class Person
{
    String name;
    LocalDate birthday;
    Person(String n, LocalDate d)
    {
        this.name=n;
        this.birthday=d;
    }
    public int getAge()
    {
        return (int)LocalDate.now().getYear()-this.birthday.getYear();
    }
}
public class Test89
{
    public static void main(String[] args)
    {
       Person p = new Person("Black",LocalDate.of(1989,Month.MARCH,23));
        System.out.print(p.getAge());
    }
}
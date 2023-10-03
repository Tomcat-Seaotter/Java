import static java.lang.System.*;

class Person
{
    public void walk()
    {
        out.println("Person walk");
    }
    public void run()
    {
        out.println("Person run");
    }
}

public class Test93
{
public static void main(String[] aegs)
{
    Person s1 = new Person()
    {
    public void walk()
    {
        out.println("Student walk");
    }
    public void run()
    {
        out.println("Student run");
    }
    };
    s1.walk();
    s1.run();

}
}

int[] a = new int[30];
ArrayList<Person> p = new ArrayList<Perosn>();
p.add(new Person(s,i))
database data --> object
new Student();
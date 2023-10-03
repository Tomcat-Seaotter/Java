import static java.lang.System.*;
import java.time.DayOfWeek;

class Animal
{
    public void run()
    {
        out.println("Animal run");
    }
}

class Dog extends Animal
{
    @Override
    public void run()
    {
        out.println("Animal run");
    }
    @Deprecated
    public void oldmethod()
    {
        out.println("old method Deprecated");
    }
    @SuppressWarnings(value={"unchecked","serial"})
    public void newmethod()
    {
        out.println("new method Deprecated");
    }
}
public class Test99
{
public static void main(String[] aegs)
{
    Animal a = new Animal();
    Dog d = new Dog();
    a.run();
    d.run();
    d.oldmethod();
    d.newmethod();
}
}
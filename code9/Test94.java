import static java.lang.System.*;

class Person
{
   private static int age =25;
   public static class Name
   {
       private String last;
       private String first;
       Name(String l, String f)
       {
           this.last = l;
           this.first =f;
       }
       public int getAge()
       {
           age++;
           return age;
       } 
   }
}

public class Test94
{
public static void main(String[] aegs)
{
    Person.Name p1 = new Person.Name("Zhang","fei");
    out.println(p1.getAge());
}
}
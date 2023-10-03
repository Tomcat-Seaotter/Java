import java.time.*;

class Student
{
    private String name;
    private LocalDate birthday;
    private String id;
    Student()
    {

    }
    Student(String id)
    {
        this.id=id;
    }
    Student(String id, String n)
    {
        this(id);
        this.name=n;
    }
    Student(String id, String n, LocalDate d)
    {
        this(id,n);
        this.birthday =d;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }
    public String getid()
    {
    return this.id;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setBirthday(LocalDate d)
    {
        this.birthday =d;
    }
    public void setId(String id)
    {
        this.id=id;
    }
public static class Builder
{
    private String id;
    private String name;
    private LocalDate birthday;
    Builder(String id)
    {
        this.id=id;
    }
    public Builder name(String n)
    {
        this.name=n;
        return this;
    }
    public Builder birthday(LocalDate d)
    {
        this.birthday =d;
        return this;
    }
    public Student build()
    {
        return new Student(this);
    }
}

private Student(Builder b)
{
 this.id=b.id;
 this.name=b.name;
 this.birthday =b.birthday;
}
}

public class Test92
{
public static void main(String[] aegs)
{
Student s1 = new Student.Builder("11111").name("zhang").birthday(LocalDate.of(1989,Month.MARCH,23)).build();
System.out.print(s1.getName());
}
}
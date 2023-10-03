import static java.lang.System.*;

interface Person
{
    public default int getId(int id)
    {
        return Math.abs(id);
    }
}

interface Student
{
    public default int getId(int id)
    {
        return id*id;
    }
}

class Junior implements Person, Student
{
    String name;
    double grade;
    public String getName()
    {
        return this.name;
    }
    public double getGrade()
    {
        return this.grade;
    }
    public int getId(int id)
    {
        return Student.super.getId(id);
    }
}


public class TestTen7
{
    public static void main(String[] args)
    {
        Junior j1 = new Junior();
        j1.name = "white";
        out.println(j1.getId(-3));
        out.println(j1.getName());
        out.println(j1.getGrade());
    }
}
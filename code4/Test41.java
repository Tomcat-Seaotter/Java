import java.util.Scanner;
class Person
{
    private String name;
    private int age;
    Person(){}
    Person(String n, int a){this.name=name;this.age=age;}
    public void setName(String n){this.name=n;}
    public void setAge(int a){this.age=a;}
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
}

public class Test41
{
  public static void main(String[] args)
  {
     Person tom = new Person();
     tom.setAge(12);
     tom.setName("Tom");
     System.out.print(tom.getAge()+"\n");
     System.out.print(tom.getName()+"\n");
  }   
}
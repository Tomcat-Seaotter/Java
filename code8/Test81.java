class Dog extends Object   
{
    int age;
    String type;
    Dog(){}
    Dog(int a, String t)
    {
        this.age=a;
        this.type=t;
    }
    public boolean equals(Object o)
    {
        boolean flag=false;
        if(o instanceof Dog)
        {

            if (this.age==((Dog)o).age && this.type.equals(((Dog)o).type))
            {
                flag= true;
            }
            else
            {
                flag= false;
            }

        }
        return flag;
    }

    public String toString()
    {
        return this.age+this.type;
    }
}

class Cat extends Object   
{
    int age;
    String type;
    Cat(){}
    Cat(int a, String t)
    {
        this.age=a;
        this.type=t;
    }
    public boolean equals(Object o)
    {
        boolean flag=false;
        if(o instanceof Cat)
        {

            if (this.age==((Cat)o).age && this.type.equals(((Cat)o).type))
            {
                flag= true;
            }
            else
            {
                flag= false;
            }

        }
        return flag;
    }

    public String toString()
    {
        return this.age+this.type;
    }
}

public class Test81
{
    public static void main(String[] args)
    {
        Dog a1 = new Dog(2,"hanshiqi");
        Cat a2 = new Cat(2,"Iran");
        Cat a3 = new Cat(2,"Iran");
        if(a3.equals(a1))
        {
            System.out.print("Equals\n");
        }
        else
        {
            System.out.print("No\n");
        }
        System.out.print(a1.toString()+"\n");
        System.out.print(a2.toString()+"\n");
    }
}
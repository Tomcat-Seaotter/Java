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
    public int hashCode()
    {
        return this.age+this.type.hashCode();
    }
    public String toString()
    {
        return this.age+this.type;
    }
}


public class Test82
{
    public static void main(String[] args)
    {
        Dog a1 = new Dog(2,"hanshiqi");
        System.out.print(a1.toString()+"\n");
        System.out.print(a1.hashCode()+"\n");
    }
}
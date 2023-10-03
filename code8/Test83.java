class Dog implements Cloneable 
{
    int age;
    String type;
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
    public Dog clone()
    {
        return this;
    }
    protected void finalize() throws Throwable
    {
        System.out.print("Dog is destoryed.\n");
    } 
}
public class Test83
{
    public static void main(String[] args)
    {
        Dog a1 = new Dog(2,"hanshiqi");
        Dog a3 = a1.clone();
        System.out.print(a1.toString()+"\n");
        System.out.print(a1.hashCode()+"\n");
        System.out.print(a3.toString()+"\n");
        System.out.print(a3.hashCode()+"\n");
        a1=null;
        a3=null;
        System.gc();
    }
}
class employee
{
	String name;
	int age;
	employee(String n, int a)
	{
	this.name=n;
	this.age=a;
	}
}

class person
{
	String name;
	int age;
	person(String n, int a)
	{
	this.name=n;
	this.age=a;
	}
	public String toString()
	{
	return this.name + " " + this.age;
	}
}

public class Lesson81
{
	public static void main(String[] args)
	{
	person p = new person("Zhang",12);
	employee p1 = new employee("Zhao",12);
	System.out.print(p.toString()+"\n");
	System.out.print(p1.toString());
	}
}
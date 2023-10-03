class Person
{
	private String name;
	private int age;
	Person()
	{}
	Person(String name)
	{
		this();
		this.name=name;
	}
	Person(String name, int age)
	{
		this(name);
		this.age=age;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
}

public class Test53
{
	

	public static void person_print(Person[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i].getName()+"\t");
			System.out.print(a[i].getAge()+"\t");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args)
	{
		Person[] p1 = new Person[3];
		for(int i=0;i<3;i++)
		{
			p1[i] = new Person("Wang",i+12);
		}
		person_print(p1);
	}
}
import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collection;
import java.util.Arrays;

abstract class Person
{
	String name;
	int age;
	Person()
	{}
	Person(String n, int a)
	{
		this.name=n;
		this.age=a;
	}
	public abstract void setName(String n);
	public abstract void setAge(int a);
	public abstract String getName();
	public abstract int getAge();
}

class Student extends Person
{
	Student()
	{}
	Student(String n, int a)
	{
		super(n,a);
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setAge(int a)
	{
		this.age=a;
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

public class TestEleven9
{
	public static void main(String[] args)
	{
		ArrayList<Person> p =  new ArrayList<Person>();
		p.add(new Student("White",23));
		p.add(new Student("John",24));
		// for (Person c:p)
		// {
		// 	out.println(c.getName());
		// 	out.println(c.getAge());
		// }
		// p.forEach(i->out.println(i.getName()));
		// p.forEach(i->out.println(i.getAge()));
		Student s;
		// Iterator<Person> iter = p.iterator();
		// while(iter.hasNext())
		// {
		// 	s =(Student)iter.next();
		// 	out.println(s.getName());
		// 	out.println(s.getAge());
		// }
		ListIterator diter = p.listIterator();
		while(diter.hasNext())
		{
			s =(Student)diter.next();
			out.println(s.getName());
			out.println(s.getAge());
		}
		while(diter.hasPrevious())
		{
			s = (Student)diter.previous();
			out.println(s.getName());
			out.println(s.getAge());
		}
		String[] array = new String[]{"nbut","znb","tetet","gsgshsh"};
		List<String> blist = Arrays.asList(array);
		for(String k:blist)
		{
			out.println(k);
		}
	}
}
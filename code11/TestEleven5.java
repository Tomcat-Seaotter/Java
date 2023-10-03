import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;

class Person
{
	private String name;
	private int age;
	Person(String n, int a)
	{
		this.name=n;
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
public class TestEleven5
{
	public static void printList(List<Person> list)
	{
		for(Person p:list)
		{
			out.println(p.getName());
			out.println(p.getAge());
		}
	}
	public static void printList1(List<?> list)
	{
		for(Object element:list)
		{
			out.println(element);
		}
	}
	public static void main(String[] args)
	{
	List<Person> list1 = new ArrayList<Person>();
	list1.add(new Person("White",23));
	list1.add(new Person("Black",24));
	printList(list1);
	List<String> list2 = new ArrayList<String>();
	list2.add("cat");
	list2.add("dog");
	printList1(list2);
	}
}
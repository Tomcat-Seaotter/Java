import java.util.*;

class people
{
	String name;
	int age;
	people(String n, int a)
	{
	this.name=n;
	this.age=a;
	}
	public int hashCode()
	{
		return Objects.hash(name,age);
	}
}

public class Lesson83
{
	public static void main(String[] args)
	{
	people p1 = new people("Zhang",12);
	people p2 = new people("Zhang",12);
	if(p1.hashCode()==p2.hashCode())
	{
		System.out.print("p1 == p2"+"\n");
	}
	else
	{
		System.out.print("p1 != p2"+"\n");
	}

	}
}
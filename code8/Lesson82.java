class student
{
	String name;
	int age;
	student(String n, int a)
	{
	this.name=n;
	this.age=a;
	}
	public String toString()
	{
	return this.name + " " + this.age;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof student)
		{
			if(this==obj)
			{
				return true;
			}
			else if(this.name==((student)obj).name && this.age==((student)obj).age)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}

public class Lesson82
{
	public static void main(String[] args)
	{
	student s1 = new student("Zhang",12);
	student s2 = new student("Zhao",12);
	student s3 =s1;
	System.out.print(s1.toString()+"\n");
	System.out.print(s2.toString()+"\n");
	System.out.print(s1.equals(s2)+"\n");
	System.out.print(s1.equals(s3));
	}
}
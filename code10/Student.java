class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private int grade;
	Student(String n, int a,int g)
	{
		this.name=n;
		this.age=a;
		this.grade=g;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getGrade()
	{
		return this.grade;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	public int compareTo(Student obj)
	{
		return getGrade()-obj.getGrade();
	}

}
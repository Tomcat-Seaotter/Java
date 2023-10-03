class Person
{
	private String name;
	private int age;
	Person()
	{}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age= age;
	}
	public void speak()
	{
		System.out.print(this.name + "," + this.age);
	}

}

class Lesson41
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("Jone");
		p.setAge(12);
		p.speak();
	}
}
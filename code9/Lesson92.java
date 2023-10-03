
//local inner class

class Employee
{
	public void setSalary(int p)
	{
		class Salary
		{
			private int salary;
			Salary(int p)
			{
				this.salary =p;
			}
			public void salaryInfo()
			{
				System.out.print("salary = " + this.salary+"\n");
			}
		}
		new Salary(p).salaryInfo();
	}

	public void setId(String id)
	{
		class Id
		{
			private String id;
			Id(String id)
			{
				this.id = id;
			}
			public void idInfo()
			{
				System.out.print("id = " + this.id+"\n");
			}
		}
		new Id(id).idInfo();
	}

}

public class Lesson92
{

	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.setSalary(7147);
		e.setId("1234");
	}
}
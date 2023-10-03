import java.math.*;

//实例内部类
class Student
{
	private String stu_id;
	class Grade
	{
		private int chinese;
		private int math;
		private int english;
		Grade(int c, int m, int e)
		{
		this.chinese = c;
		this.math = m;
		this.english =e;	
		}
		public int sum()
		{
			return this.math+this.chinese+this.english;
		}
		public void setId(String s)
		{
			Student.this.stu_id = s;
		}
	}
	public String getId()
	{
		return this.stu_id;
	}
	public void sum_grade()
	{
		Grade g1 = new Grade(89,90,99);
		System.out.print(g1.sum()+"\n");
	}

}

public class Lesson91
{

	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student.Grade g1 = s1.new Grade(90,90,95);
		g1.setId("102");
		System.out.print(g1.sum()+"\n");
		s1.sum_grade();
		System.out.print(s1.getId()+"\n");
	}
}
import java.util.Arrays;

class Lesson108
{
	public static void main(String[] args)
	{
		Student[] s = new Student[4];
		s[0] = new Student("Li",23,95);
		s[1] = new Student("Wang",24,86);
		s[2] = new Student("Zhang",21,67);
		s[3] = new Student("An",23,77);
		// Arrays.sort(s,new StudentComparator());
		Arrays.sort(s);
		for (Student c:s)
		{
			System.out.print(c.getName() + "," + c.getAge()+ "," +  c.getGrade() + "\n");
		}

	}
}
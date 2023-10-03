import java.time.*;

class Person {
	LocalDate birthday;
	String name;
	Address add;
	class Address
	{
		String city;
		String street;
        String zipcode;
		Address(String c, String s,String z)
		{
			this.city =c;
			this.street =s;
            this.zipcode =z;
		}
		public String toString()
		{
			return this.city +"\t"+ this.street +"\t" +this.zipcode;
		}
	}
	Person(LocalDate b, String n, Address a)
	{
		this.birthday = b;
		this.name= n;
		this.add =a;
	}
	Person()
	{

	}
	public Address getAddress()
	{
		return this.add;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return LocalDate.now().getYear() - this.birthday.getYear();
	}

}
public class Test90 {
	public static void main(String[] args) {
		Person p = new Person(LocalDate.of(1989,Month.MARCH,23),"Zhang Feng",new Person().new Address("Ningbo","fenghuaRoad","315211"));
		System.out.print(p.getName()+"\n");
		System.out.print(p.getAge()+"\n");
		System.out.print(p.getAddress().toString()+"\n");
		Person p1 = new Person(LocalDate.of(1990,Month.JULY,2),"Wang Hai",new Person().new Address("Ningbo","fenghuaRoad","315211"));
		System.out.print(p1.getName()+"\n");
		System.out.print(p1.getAge()+"\n");
		System.out.print(p1.getAddress().toString());
	}
}
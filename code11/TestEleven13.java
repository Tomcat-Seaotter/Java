import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;

class Good
{
	private String id;
	private String goodname;
	private float price;
	Good(String id, String goodname, float price)
	{
		this.id=id;
		this.goodname =goodname;
		this.price=price;
	}
	public String getId()
	{
		return this.id;
	}
	public String getGoodname()
	{
		return this.goodname;
	}
	public float getPrice()
	{
		return this.price;
	}
}

class User
{
	private String name;
	private ArrayList<Good> list;
	User(String name)
	{
		this.name=name;
		list = new ArrayList<Good>();
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return this.name;
	}
	public void addgood(Good good)
	{
		this.list.add(good);
	}
	public Good removegood(Good good)
	{
		return this.list.remove(this.list.indexOf(good));
	}
	public void display()
	{
		Iterator iter = this.list.iterator();
		Good g;
		while(iter.hasNext())
		{
			g = (Good)iter.next();
			out.print(g.getId()+"\t");
			out.print(g.getGoodname()+"\t");
			out.print(g.getPrice()+"\t");
		}
		out.print("\n");
	}
	public float totalPrice()
	{
		float total = 0.0f;
		Iterator iter = this.list.iterator();
		Good g;
		while(iter.hasNext())
		{
			g = (Good)iter.next();
			total+=g.getPrice();
		}
		return total;
	 }
}

public class TestEleven13
{
	public static void main(String[] args)
	{
		HashMap<String, User> hash = new HashMap<String,User>();
		String s = "john@163.com";
		User u = new User("john");
		hash.put(s,u);
		s = "white@126.com";
		u = new User("white");
		hash.put(s,u);
		s = "beason@qq.com";
		u = new User("beason");
		hash.put(s,u);	
		u.addgood(new Good("1001","tv",2500f));
		u.addgood(new Good("1002","radio",500f));
		u.addgood(new Good("1003","computer",5500f));
		u.display();
		out.println("total price "+u.totalPrice());
		Iterator<String> iter = hash.keySet().iterator();
		while(iter.hasNext())
		{
			out.println(iter.next());
		}
		Iterator<User> iter1 = hash.values().iterator();
		while(iter1.hasNext())
		{	
			u = (User)iter1.next();
			out.println(u.getName());
			out.println(u.totalPrice());
		}
	}
}
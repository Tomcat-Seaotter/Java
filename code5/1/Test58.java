import java.util.ArrayList;
class Stack
{
	private int size;
	private static int capacity = 10;
	private  ArrayList<Integer> elements;
	Stack()
	{
		this.size = 0;
		this.elements = new ArrayList<Integer>(capacity);
	}
	Stack(int c)
	{
		this.size = 0;
		this.elements = new ArrayList<Integer>(c);
	}
	public void push(int c)
	{
 		this.elements.add(this.size++,c);
	}
	public int pop()
	{
		int x = this.elements.get(--this.size);
		this.elements.remove(this.size);
		return x;
	}
	public int peek()
	{
		return this.elements.get(--this.size);
	}
	public boolean empty()
	{
		return this.size ==0;
	}
	public int getSize()
	{
		return this.size;
	}
}

public class Test58
{
	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		for(int i=0;i<20;i++)
		{
			s1.push(i);
		}
		while(!s1.empty())
		{
			System.out.print(s1.pop()+"\t");
		}
	}
}
class Stack
{
	private int size = 0;
	private static int capacity = 10;
	private int[] elements;

	Stack()
	{
		this.elements=new int[capacity];
	}

	Stack(int c)
	{
		this.elements=new int[c];
	}

	public void push(int c)
	{
		if(this.size>=this.elements.length)
		{
			int[] temp = new int[this.elements.length*2];
			System.arraycopy(this.elements,0,temp,0,elements.length);
			this.elements = temp;
		}
		this.elements[size++]=c;

	}
	public int pop()
	{
		--this.size;
		return this.elements[this.size];
	}
	public int peek()
	{
		return this.elements[--this.size];
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

public class Test57
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
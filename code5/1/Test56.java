class Stack
{
	private int[] elements;
	private int size = 0;
	static final int Default_Capacity = 10;
	Stack()
	{
		elements = new int[Default_Capacity];
	}
	Stack(int c)
	{
		elements = new int[c];		
	}
	public void push(int v)
	{
		if(size>=elements.length)
		{
			int[] temp = new int[elements.length*2];
			System.arraycopy(elements,0,temp,0,elements.length);
			elements = temp;
		}
		elements[size++]=v;
	}
	public int pop()
	{
		--size;
		return elements[size];
	}
	public int peek()
	{
		return elements[size-1];
	}
	public boolean empty()
	{
		return size ==0;
	}
	public int getSize()
	{
		return size;
	}
}
public class Test56
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		for(int i=0; i<20;i++)
		{
			s.push(i);
		}
		while(!s.empty())
		{
			System.out.print(s.pop()+"\t");
		}

	}
}
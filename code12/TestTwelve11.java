import java.io.*;
import java.util.Scanner;

class ObjectStack
{
	private static final int defaultSize=10;
	private int size;
	private int top;
	private Object[] list1;
	ObjectStack()
	{
		init(defaultSize);
	}
	ObjectStack(int size)
	{
		init(size);
	}
	void init(int size)
	{
		this.size=size;
		top=0;
		list1 = new Object[size];
	}
	void clear()
	{
		top=0;
	}
	void push(Object it)
	{
		assert top<size:"Stack out of bound\n";
		list1[top++]=it;
	}
	Object pop()
	{
		assert !isEmpty():"Stack is Empty\n";
		return list1[--top];
	}
	Object topValue()
	{
		assert !isEmpty():"Stack is Empty\n";
		return list1[top-1];
	}
	boolean isEmpty()
	{
		return top==0;
	}
}

class TestTwelve11
{
	public static void main(String[] args)
	{
	ObjectStack os = new ObjectStack(3);
	System.out.print(os.isEmpty());
	// os.pop();
	os.push(new Integer(30));
	os.push(new Integer(20));
	os.push(new Integer(10));
	os.push(new Integer(40));
	System.out.print(os.pop());
	System.out.print(os.pop());
	System.out.print(os.pop());
	}
}
import static java.lang.System.*;

class Node<T>
{
	private T v;
	Node()
	{

	}
	Node(T v)
	{
	this.v =v;
	}

	public T getT()
	{
	return this.v;
	}

	public void setT(T v)
	{
	this.v= v;
	}

	public void showType()
	{
	out.println(v.getClass().getName());
	}
}


public class TestEleven1
{
	public static void main(String[] args)
	{
	Node<Integer> node = new Node<Integer>();
	node.setT(23);
	node.showType();
	out.println(node.getT());
	}
}
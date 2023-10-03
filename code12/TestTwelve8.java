import java.io.*;


class Door implements AutoCloseable
{
	Door()
	{
		System.out.print("Door create\n");
	}
	public void open() throws Exception
	{
		System.out.print("Door is opened\n");
	}
	public void close()
	{
		System.out.print("Door is closed\n");
	}
}

class Window implements AutoCloseable
{
	Window()
	{
		System.out.print("Window create\n");
	}
	public void open() throws Exception
	{
		System.out.print("Window is opened\n");
	}
	public void close()
	{
		System.out.print("Window is closed\n");
	}
}

class TestTwelve8
{
	public static void main(String[] args)
	{
		//try-with-resources
		// try(resource-specification)
	try(Door d = new Door();
		Window w = new Window())
	{
		d.open();
		w.open();
	}
	catch(Exception e)
	{
		System.out.print("There is an exception\n");
	}
	finally
	{
		System.out.print("The door and window are all closed\n");
	}
	}
}
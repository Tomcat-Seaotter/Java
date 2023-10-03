interface staticmethods
{
	int statics = 10;
	public static void display()
	{
		System.out.print(statics +"\n");
	}
	public default void printA()
	{
		System.out.print("default methods \n");
	}
}
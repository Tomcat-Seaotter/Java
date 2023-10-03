class Lesson73
{
	public static final int size =50;
	public static void main(String[] args)
	{
		Lesson73 t =new Lesson73();
		t.methodA(5);
		t.methodB(6);
	}
	public void methodA(final int i)
	{
		i++;
	}
	public int methodB(final int i)
	{
		final int j = i+1;
		return j;
	}
}
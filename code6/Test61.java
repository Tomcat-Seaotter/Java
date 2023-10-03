public class Test61
{
    public static void main(String[] args)
    {
		String[] str  = "2020-10-30,2019-12-23,2018-10-30,2017-12-23,2016-10-30,2015-12-23".split(",",3);
		for(String c: str)
		{
			System.out.println(c);
		}
    }
}
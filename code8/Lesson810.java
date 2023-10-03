import java.math.*;

public class Lesson810
{

	public static void main(String[] args)
	{
		int a = Integer.parseInt("23");
		float b = Float.parseFloat("12.3f");
		double c = Double.parseDouble("5.4");
		BigInteger d = new BigInteger("9223372036854775807");
		BigInteger e = d.multiply(new BigInteger("2")); 
		System.out.print(a+"\n");
		System.out.print(b+"\n");
		System.out.print(c+"\n");
		System.out.print(d+"\n");
		System.out.print(e+"\n");
		System.out.print("30!="+fact(50));
	}

	public static BigInteger fact(long n)
	{
		BigInteger r = BigInteger.ONE;
		for(long i=1;i<=n;i++)
		{
			r = r.multiply(new BigInteger(i+""));
		}
		return r;
	}
	
}
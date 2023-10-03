import java.util.function.BiFunction;
import java.lang.Math;

class Lesson1014
{
	public static void main(String[] args)
	{
		BiFunction<Float,Float,Float> fun1 = (w,d) -> (float)Math.pow(w,d);
		float c, d;
		c = 5.0f;
		d = 3.0f;
		float r = fun1.apply(c,d);
		System.out.print(r);
	}
}
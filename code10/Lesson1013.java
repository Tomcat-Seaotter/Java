import java.util.function.Function;

class Lesson1013
{
	public static void main(String[] args)
	{
		Function<Integer,Double> fun1 = (inputs) ->{
			double r = 1;
			while(inputs>0){
			r = inputs*r;
			inputs--;
		}
		return r;
		};
		int d = 5;
		double r = fun1.apply(d);
		System.out.print(r);
	}
}
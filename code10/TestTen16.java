import static java.lang.System.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;


// single abstract method
// Function<T,R>
// BiFunction<T,U,R>
// UnaryOperator<T>
// BinaryOperator<T>
// Predicate<T>
// Supplier<T>
// Comsumer<T>

@FunctionalInterface
interface UnaryOperator<T>
{
	T apply(T a);
}

@FunctionalInterface
interface BinaryOperator<T,U>
{
	T apply(T a, U b);
}

@FunctionalInterface
interface BiFunction<T,U,R>
{
	R apply(T a, U b);
}

@FunctionalInterface
interface Function<T,R>
{
	R apply(T a);

}
//R return parameter
//T input parameter

@FunctionalInterface
interface Converter<F,T>
{
    T change(F a);
}

public class TestTen16
{
    public static void main(String[] args)
    {
    	UnaryOperator<Float> unary = (w) -> w*4;
	//	float b = unary.apply(3.4f);
    	BinaryOperator<Float,Float> binary = (w,h) -> w*2+w*3;
    	float b;
    	b= binary.apply(3f,4f);
		out.printf("%3f \t \n",b);
    }
}
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

public class TestTen15
{
    public static void main(String[] args)
    {
		BiFunction<Float,Float,Float> area = (w,h) -> w*h;
		float w  =4.0f;
		float h = 4.3f;
		float r = area.apply(w,h);
		out.printf("%3.2f \t \n",r);
    }
}
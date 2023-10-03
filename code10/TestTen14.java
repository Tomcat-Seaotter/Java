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
interface Function<T,R>
{
	R apply(T argument);

}
//R return parameter
//T input parameter

@FunctionalInterface
interface Converter<F,T>
{
    T change(F from);
}

public class TestTen14
{
    public static void main(String[] args)
    {
		Function<Integer,Double> miletokms = (input) -> 1.6*input;
		int miles =3;
		double kms = miletokms.apply(miles);
		out.printf("%d miles = %3.2f kilometers\n",miles,kms);
    }
}
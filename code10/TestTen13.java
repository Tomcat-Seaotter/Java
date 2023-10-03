import static java.lang.System.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;


// single abstract method

@FunctionalInterface
interface Converter<F,T>
{
    T change(F from);
}

public class TestTen13
{
    public static void main(String[] args)
    {
        Converter<String,Integer> con = (from)-> Integer.valueOf(from);
        Integer convertered = con.change("344");
        out.println(convertered);
        out.println(convertered instanceof Integer);
    }
}
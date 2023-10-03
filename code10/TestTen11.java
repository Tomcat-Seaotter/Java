import static java.lang.System.*;
import java.util.Arrays;
import java.util.Comparator;

public class TestTen11
{
    public static void main(String[] args)
    {
        String[] names = new String[]{"peter","anna","mike","john"};
        Arrays.sort(names, new Comparator<String>()
        {
            public int compare(String a, String b)
            {
                return a.compareTo(b);
            }
        });//匿名内部类
        for (String a:names)
        {
            out.print(a+"\t\n");
        }
    }
}
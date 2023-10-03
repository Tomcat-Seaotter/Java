import java.math.*;
import java.time.LocalDate;
import static java.lang.System.*;

public class Test813
{
    public static void main(String[] args)
    {
        LocalDate p = LocalDate.now();
        out.println(p.getDayOfWeek());
        p = p.plusDays(4);
        out.println(p.getDayOfWeek());
    }
}
import static java.lang.System.*;
public class Test84
{
    public static void main(String[] args)
    {
        Character a = new Character('A');
        Character b = new Character('a');
        out.println(a.compareTo(b));
        out.println(Character.isDigit(a));
        out.println(Character.isJavaIdentifierStart('\u8f6f'));
        out.println(Character.isLetter('\u0030'));
        out.println(Character.isLowerCase('\u0061'));
        out.println(Character.isUpperCase('\u0041'));
        out.println(Character.isWhitespace(' '));
        out.println(Character.toLowerCase('A'));
        out.println(Character.toUpperCase('a'));
        out.println(Character.isJavaIdentifierStart('\u8f6f'));
        out.println(Character.isJavaIdentifierPart('\u0032'));
        out.println('\u4ef6');
    }
}
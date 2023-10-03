import java.util.*;

public class Lesson88
{

	public static void main(String[] args)
	{
		Character a = new Character('A');
		Character b = new Character('π');
		Character c = new Character('中');
		System.out.print(a.compareTo('D')+"\n");
		System.out.print(a.charValue()+"\n");
		System.out.print(Character.isJavaIdentifierStart(b)+"\n");
		System.out.print(Character.isJavaIdentifierPart(b)+"\n");
		System.out.print(Character.isDigit(b));

	}
	
}
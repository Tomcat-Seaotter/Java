import java.util.*;
public class Lesson18
{
	public static void main(String[] args)
	{
	int i,a,k,s;
	Scanner sc = new Scanner(System.in);
	i = sc.nextInt();
	for(a=1;a<=i;a++)
	{
		s=1;
		for(k=2;k<=a/2;k++)
		{
			if(a%k==0)
				s+=k;
		}
		if(a==s)
		{
			System.out.format("%3d=1",a);
			for(k=2;k<=a/2;k++)
				if(a%k==0)
					System.out.format("+%d",k);
			System.out.format("\n");
		}
	}
}
}
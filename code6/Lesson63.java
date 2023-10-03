import java.util.Scanner;

class Lesson63
{
	public static void main(String[] args)
	{
		int i=0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1= new String(s);
		while(s1.indexOf('-')!=-1)
		{
			i++;
			s1 = s1.substring(s1.indexOf('-')+1);
		}
		if(i==4)
		{
			s=s.replace("-","");
			//System.out.print(s);
			if(s.length()!=13)
			{
				flag = false;
			}
			else
			{
				i=0;
				while(i<s.length())
				{
					if(s.charAt(i)>='0'&&s.charAt(i)<='9')
					{
						i++;
					}
					else
					{
						flag = false;
						break;
					}
				}
			}
		}
		else
		{
			flag=false;
		}
		if(!flag)
		{

			System.out.print("ISBN Error");
		}
		else
		{
			System.out.print("ISBN Right");
		}
	}
}
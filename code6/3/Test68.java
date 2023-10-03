import java.util.Scanner;

public class Test68
{
	public static int bitNumber(String s)
	{
		int i =1;
		String[] words = s.split(" ");
		while(i<=words.length)
		{
			i*=2;
		}
		return i;
	}

	public static String encode(String s, String[] table, int number)
	{
		String stemp; 
		String ktemp = "";
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<=3;j++)
			{
				stemp = s.substring(i,i+j);
				for(int k=0;k<table.length;k++)
				{
					if(stemp.equals(table[k]))
					{
						// i=i+j;
						// for(int n=1;n<=number;n++)
						// {
						// 	ktemp=ktemp+k%2;
						// 	k/=2;
						// }
					System.out.print(stemp+"\t");
					}

				}
			}
		}
		return ktemp;
	}

	public static void main(String[] args)
	{
		String str,str1;
		String word = "b p m f d t n l g k h j q x zh ch sh r z c s y w a o e i u \u00FC ai ei ui ao ou iu ie \u00FCe er an en in un \u00FCn ang eng ing ong";
		// String[] words = word.split(" ");
		// for (String c: words)
		// {
		// 	System.out.print(c+"\t");
		// }
		str = "bmdddlslsssengl\u00FCai";
		str1 = encode(str,word.split(" "),bitNumber(word));
		System.out.print(str1);
		System.out.print(bitNumber(word));

	}
}
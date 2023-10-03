import java.io.*;
import java.util.Scanner;

class TestTwelve10
{
	public static void main(String[] args)
	{
	int i;
	int sum = 0;
	for(i=0;i<10;i++)
	{
		sum+=i;
	}
	assert i==10;
	assert sum>10 && sum<5*10: "sum is" +sum;
	System.out.print("sum="+sum);
	}
}
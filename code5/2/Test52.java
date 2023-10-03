public class Test52
{
	public static int[][] matrix_add(int[][] a, int[][] b)
	{
		int[][] c;
		if(a[0].length==b[0].length&&a.length==b.length)
		{
		c = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
				c[i][j] = a[i][j]+b[i][j];
				}
			}
		}
		else
		{
			c =null;
		}
	return c;
	}

	public static int[][] matrix_minus(int[][] a, int[][] b)
	{
		int[][] c;
		if(a[0].length==b[0].length&&a.length==b.length)
		{
		c = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[0].length;j++)
				{
				c[i][j] = a[i][j]-b[i][j];
				}
			}
		}
		else
		{
			c = null;
		}
	return c;
	}

	public static int[][] matrix_product(int[][] a, int[][] b)
	{
		int[][] c;
		if(a.length==b[0].length&&a[0].length==b.length)
		{
		c = new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[0].length;j++)
				{
					for(int k=0; k<b.length;k++)
					{
						c[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
		}
		else
		{
			c = null;
		}
		return c; 
	}

	public static void matrix_print(int[][] a)
	{
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[0].length;j++)
				{
				System.out.print(a[i][j]+"\t");
				}
				System.out.print("\n");
			}
	}
	
	public static void main(String[] args)
	{
		int[][] a = {{0,1,0},{1,1,1},{1,0,0}};
		int[][] b = {{1,0,11},{1,2,1},{0,0,0}};
		int[][] c =matrix_add(a,b);
		matrix_print(c);
		int[][] d =matrix_product(a,b);
		matrix_print(d);
	}
}
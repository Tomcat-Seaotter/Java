public class Test51
{
	public static int[] bubblesort(int[] array)
	{
		int temp;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=array.length-1;j>i;j--)
			{
				if(array[j]>array[j-1])
				{
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp; 
				}
			}
		}
		return array;
	}

	public static int[] selectsort(int[] array)
	{
		int t,k;
		for(int i=0;i<array.length-1;i++)
		{
			t = i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[t]>array[j])
				{
					t =j;
				}
			}
			if(i!=t)
			{
				k = array[t];
				array[t] = array[i];
				array[i] = k;
			}
		}
		return array;
	}

	public static int[] insert(int[] array)
	{
		int i,j,t;
		i=1;
		while(i<array.length)
		{
			t = array[i];
			j=i;
			while(j>0&&t<array[j-1])
			{
				array[j] = array[j-1];
				j--;
			}
			if(j!=i)
			{
				array[j] = t;
			}
			i++;
		}
		return array;
	}

	public static int partition(int[] array, int start, int end)
	{
		int base;
		base = array[start];
		while(start<end)
		{
			while(start<end && array[end] >= base)
			{
				end--;
			}
			array[start] = array[end];
			while(start<end && array[start] <= base)
			{
				start++;
			}
			array[end] =array[start];
		}
		array[end] = base;
		return start;
	}

	public static void quicksort(int[] array, int start, int end)
	{
		int index;
		if(start<end)
		{
			index = partition(array,start,end);
			quicksort(array,start,index-1);
			quicksort(array,index+1,end);
		}
	}

	public static void main(String[] args)
	{
		int[] a = new int[] {5,6,2,1,12};
		// int[] b = bubblesort(a);
		int[] b = selectsort(a);
		int[] c = insert(a);
		for(int d: c)
		{
			System.out.print(d+"\t");
		}
		System.out.print("\n");
		quicksort(a,0,a.length-1);
		for(int d:a)
		{
			System.out.print(d+"\t");
		}	
	}
}
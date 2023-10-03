import static java.lang.System.*;

interface Entry<K, V>{
	public K getKey();
	public V getValue();
}

class Pair<K, V> implements Entry<K, V>
{
	private K key;
	private V value;
	Pair()
	{

	}
	Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

class Util
{
	public static <T> void swap(T[] array, int i, int j)
	{
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2)
	{
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}



public class TestEleven4
{
	public static void main(String[] args)
	{
		Integer[] numbers = {1,3,5,7};
		Util.<Integer>swap(numbers,0,3);
		for (Integer n:numbers)
		{
			out.println(n+" ");
		}
		Pair<Integer,String> p1 = new Pair<>(1,"apple");
		Pair<Integer,String> p2 = new Pair<>(2,"orange");
		boolean same  = Util.<Integer,String>compare(p1,p2);
		out.println(same);
	}
}
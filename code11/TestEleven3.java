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

public class TestEleven3
{
	public static void main(String[] args)
	{
		Pair<String,Integer> p = new Pair<String, Integer>();
		p.setKey("nbut");
		p.setValue(1001);
		out.println(p.getKey());
		out.println(p.getValue());
		Pair<String,Integer> p1 = new Pair<String, Integer>("ZNT",1002);
		out.println(p1.getKey());
		out.println(p1.getValue());
	}
}
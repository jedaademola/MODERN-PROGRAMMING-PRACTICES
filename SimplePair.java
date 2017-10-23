package edu.mum.mpp.lesson11;

public class SimplePair <K,V>{
	private K key;
	private V value;

	public SimplePair (K key,V value)
	{
		this.key= key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	public static void main(String args[])
	{
		SimplePair <String,String> pair = new SimplePair <> ("Hello","World");
		String hello = pair.getKey();
		String  world = pair.getValue();
		System.out.println(hello);
		System.out.println(world);
	}
	
}

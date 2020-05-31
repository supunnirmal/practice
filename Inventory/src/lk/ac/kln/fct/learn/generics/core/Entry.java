package lk.ac.kln.fct.learn.generics.core;

//TODO use generics for the value.
//You have to start changing the code from here.
public class Entry<K,V> {
	private K key;
	//TODO use generics for the value.
	private V value;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

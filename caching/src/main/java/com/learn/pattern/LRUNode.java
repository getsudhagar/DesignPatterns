package com.learn.pattern;

public class LRUNode<K, V> {
	private K key;
	private V value;
	private LRUNode<K, V> previous;
	private LRUNode<K, V> next;
	
	LRUNode(K key, V value) {
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

	public LRUNode<K,V> getPrevious() {
		return previous;
	}

	public void setPrevious(LRUNode<K,V> previous) {
		this.previous = previous;
	}

	public LRUNode<K,V> getNext() {
		return next;
	}

	public void setNext(LRUNode<K,V> next) {
		this.next = next;
	}

}

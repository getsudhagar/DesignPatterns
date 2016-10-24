package com.learn.pattern;

public class LFUNode<K, V> {
	private K key;
	private V value;
	LFULinkNode<K, V> frequency;
	LFUNode<K, V> next;
	
	public LFUNode<K, V> getNext() {
		return next;
	}

	public void setNext(LFUNode<K, V> next) {
		this.next = next;
	}

	public LFULinkNode<K, V> getFrequency() {
		return frequency;
	}

	public void setFrequency(LFULinkNode<K, V> frequency) {
		this.frequency = frequency;
	}

	LFUNode(K key, V value) {
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

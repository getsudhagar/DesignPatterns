package com.learn.pattern;

public class LFULinkNode<K, V> {

	public void setNodeCounter(int nodeCounter) {
		this.nodeCounter = nodeCounter;
	}

	private int nodeCounter;
	private LFULinkNode<K, V> next;
	LFUNode<K, V> lt; 
	
	public LFUNode<K, V> getLt() {
		return lt;
	}

	public void setLt(LFUNode<K, V> lt) {
		this.lt = lt;
	}

	LFULinkNode(int nodeCounter) {
		this.nodeCounter = nodeCounter;
	}

	public int getNodeCounter() {
		return nodeCounter;
	}

	public LFULinkNode<K, V> getNext() {
		return next;
	}

	public void setNext(LFULinkNode<K, V> next) {
		this.next = next;
	}

}

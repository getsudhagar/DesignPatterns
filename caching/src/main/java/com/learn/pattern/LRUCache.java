package com.learn.pattern;

import java.util.HashMap;

/**
 *LRU algorithm with runtime complexity of O(1) for each of the
 * operations (get, put and evict)
 */
public class LRUCache<K, V> implements InMemoryCache<K, V> {

	private LRUNode<K, V> lruHead;
	private LRUNode<K, V> lruTail;
	private HashMap<K, LRUNode<K, V>> store;
	private int capacity;

	public LRUCache(HashMap<K,LRUNode<K,V>> store, int capacity) {
		this.store = store;
		this.capacity = capacity;
	}

	public V get(K key) {
		LRUNode<K, V> nd = store.get(key);
		if(nd != null){
			removeFromLRUList(nd);
			addFrontLRUList(nd);
		}
		return nd.getValue();
	}

	public void put(K key, V value) {
		LRUNode<K, V> nd= store.get(key);
		if(nd == null){
			 if (!(store.size() < this.capacity)) {
				evict(); 
			 }
			 LRUNode<K,V> newNode = new LRUNode<K,V>(key,value);
			 store.put(key, newNode);
			 //removeFromLRUList(newNode);
			 addFrontLRUList(newNode);
		}else{
			nd.setValue(value);
			removeFromLRUList(nd);
			addFrontLRUList(nd);
		}

	}

	public void clear() {
		store.clear();
		lruHead = null;
		lruTail = null;
	}
	
	private void addFrontLRUList(LRUNode<K, V> node){
		if(lruHead == null){
			lruHead = node;
			lruTail = node;
		}else{
			node.setNext(lruHead.getNext());
			lruHead.setPrevious(node);
			lruHead =node;
		}
	}

	private void removeFromLRUList(LRUNode<K, V> node) {
		if (node.getPrevious() == null) {
			lruHead = node.getNext();
		} else {
			node.getPrevious().setNext(node.getNext());
		}
		if (node.getNext() == null) {
			lruTail = node.getPrevious();
		} else {
			node.getNext().setPrevious(node.getPrevious());
		}
	}
	
	private void evict(){
		store.remove(lruTail.getKey());
		lruTail=lruTail.getPrevious();
		lruTail.setNext(null);
	}

}

package com.learn.pattern;

import java.util.HashMap;

public class CacheBuilder<K, V> {
	private int capacity;
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public InMemoryCache<K, V> buildLfuCache() {
		return new LFUCache(new HashMap<K, LFUNode<K, V>>(), capacity);
	}

	public InMemoryCache<K, V> buildLruCache() {
		return new LRUCache(new HashMap<K, LRUNode<K, V>>(), capacity);
	}

}

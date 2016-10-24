package com.learn.pattern;

public interface InMemoryCache<K, V> {

	V get(K key);
	
	void put(K key, V value);
	
	void clear();

}

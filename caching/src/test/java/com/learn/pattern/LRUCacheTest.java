package com.learn.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void test() {
		CacheBuilder<String,String> builder= new CacheBuilder<String,String>();
		builder.setCapacity(4);
		InMemoryCache<String,String> cache = builder.buildLruCache();
		cache.put("A", "abc");
		cache.put("B", "abcd");
		cache.get("A");
	}

}

package com.learn.pattern;

import java.util.HashMap;

/**
 *LFU algorithm with runtime complexity of O(1) for each of the
 *operations (get, put and evict)
 */
public class LFUCache<K, V> implements InMemoryCache<K, V> {
	private LFULinkNode<K, V> lfuHead;
	private HashMap<K, LFUNode<K, V>> store;
	private int capacity;

	public LFUCache(HashMap<K, LFUNode<K, V>> store, int capacity) {
		this.store = store;
		this.capacity = capacity;
	}
	
	
	public V get(K key) {
		 LFUNode<K, V> nd = store.get(key);
		 if(nd!=null){
			 LFULinkNode<K, V> ndl = nd.getFrequency().getNext();
			 if(ndl == null){
				 ndl = new LFULinkNode<K, V>(nd.getFrequency().getNodeCounter()+1);
				 nd.setFrequency(ndl);
				 ndl.setLt(nd);
			 }else{
				 LFUNode<K, V> lt =  ndl.getLt();
				 nd.setFrequency(ndl);
				 nd.setNext(lt); 
				 ndl.setLt(nd);
			 }
			 
			 return nd.getValue();
		 }
		return null;
	}

	public void put(K key, V value) {
		  if (!(store.size() < this.capacity)) {
			evict(); 
		  }
	      if(lfuHead==null){
	    	  lfuHead = new LFULinkNode<K, V>(0);
	      }
	      LFUNode<K, V> nd = new LFUNode<K, V>(key,value);
    	  nd.setFrequency(lfuHead);
    	  store.put(key, nd);
    	  lfuHead.setLt(nd);
	}

	

	private void evict() {
		LFUNode<K, V> nd = lfuHead.getLt();
		store.remove(nd.getKey());
		lfuHead.setLt(nd.next);
	}


	public void clear() {
		store.clear();
		lfuHead=null;
	}

}

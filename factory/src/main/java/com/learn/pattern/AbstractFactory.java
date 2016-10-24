package com.learn.pattern;

public abstract class AbstractFactory {
	abstract public Quote createQuote();
	abstract public Order createOrder();
	/**
	 * Factory method to create specific factory
	 * @param type
	 * @return instance of AbstractFactory
	 */
	public static AbstractFactory getFactory(int type){
	    switch (type) {
	      case 0  : 
	          return new AsiaPacificFactory();
	      case 1  : 
	          return new EMEAFactory();      
	      default : 
	          return null;
	    }
		
	}
}

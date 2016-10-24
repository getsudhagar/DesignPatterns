package com.learn.pattern;

public class SalesApp {
	
	private AbstractFactory salesFactory;

	public SalesApp(AbstractFactory salesFactory) {
		this.salesFactory = salesFactory;
	}

	public Quote  getQuote()
	{
		return salesFactory.createQuote();
	}
	
	public Order  getOrder()
	{
		return salesFactory.createOrder();
	}
	
}

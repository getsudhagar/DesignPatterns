package com.learn.pattern;

public abstract class SalesReport {
	
	public SalesReport() {
		
	}
	protected abstract  Quote  getQuote();
	protected abstract  Order  getOrder();
	
	/**
	 * Method uses the factory methods to get/create objects .
	 * Object creation delegated to individual sub classes.
	 */
	public void  getReport(){
		System.out.println("Generating report with given Quote and Order" +getQuote()+getOrder());
	}
}

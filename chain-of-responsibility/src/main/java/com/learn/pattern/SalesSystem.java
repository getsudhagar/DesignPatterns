package com.learn.pattern;

public class SalesSystem {

	private Seller seller ;
	
	public void configure(){
		seller = new SalesMan();
		Manager manager = new Manager();
		President president = new President();
		seller.setNextInLevel(manager);
		manager.setNextInLevel(president);
	}
	
	public boolean processRequest(PurchaseRequest request){
		return seller.processRequest(request);
	}
}

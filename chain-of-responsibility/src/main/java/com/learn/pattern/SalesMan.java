package com.learn.pattern;

public class SalesMan extends Seller {
	 protected static final double LIMIT = 500;
	@Override
	protected boolean canSell(PurchaseRequest request) {
		if(request.getQuantity()<10 && request.getPrice()>=200){
			return true;
		}
		return false;
	}

}

package com.learn.pattern;

public class Manager extends Seller {
	protected static final double LIMIT = 500;
	@Override
	protected boolean canSell(PurchaseRequest request) {
		if(request.getQuantity()<100 && request.getQuantity()>50 && request.getPrice()>=190){
			return true;
		}
		return false;
	}

}

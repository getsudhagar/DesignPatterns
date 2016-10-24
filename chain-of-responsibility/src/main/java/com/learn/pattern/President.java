package com.learn.pattern;

public class President extends Seller {

	@Override
	protected boolean canSell(PurchaseRequest request) {
		if(request.getQuantity()<100 && request.getQuantity()>50 && request.getPrice()>=190){
			return true;
		}else if(request.getCustomerID().equals("123")&& request.getPrice()>=180){
			return true;
		}
		return false;
	}

}

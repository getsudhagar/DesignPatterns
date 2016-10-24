
package com.learn.pattern;


public abstract class Seller {
	 protected Seller nextInLevel;
	 public void setNextInLevel(Seller nextInLevel){
	      this.nextInLevel = nextInLevel;
	 }
     public boolean  processRequest(PurchaseRequest request){
    	 if(canSell(request)){
    		 System.out.println("Request Accepted");
    		 return true;
    	 }else if(nextInLevel != null){
    		 return nextInLevel.processRequest(request);
    	 }else{
    		 return false;
    	 }
     }
     abstract protected boolean canSell(PurchaseRequest request);
}

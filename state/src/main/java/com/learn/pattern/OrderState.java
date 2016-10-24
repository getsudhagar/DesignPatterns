package com.learn.pattern;

public class OrderState implements UserState {

	public void configureItem(StateTransition stateTransition) {
		 System.out.println("order Can't be changed");
		
	}

	public void placeQuote(StateTransition stateTransition) {
		 System.out.println("order Can't be changed");
		
	}

	public void PlaceOrder(StateTransition stateTransition) {
		System.out.println("already an order");
		
	}

	public void complete(StateTransition stateTransition) {
		System.out.println("Statring fresh");
		stateTransition.changeStateTo(StateTransition.CONFIGURE);
		
	}


}

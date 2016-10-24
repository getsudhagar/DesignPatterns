package com.learn.pattern;

public class ConfigureState implements UserState {

	public void configureItem(StateTransition stateTransition) {
		System.out.println("Adding item");
		
	}

	public void placeQuote(StateTransition stateTransition) {
		System.out.println("taking items to  quote ");
		stateTransition.changeStateTo(StateTransition.QUOTE);
		
	}

	public void PlaceOrder(StateTransition stateTransition) {
		System.out.println("can't place order");
		
	}

	public void complete(StateTransition stateTransition) {
		System.out.println("Can't complete");
		
	}

}

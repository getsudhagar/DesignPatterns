package com.learn.pattern;

public class QuoteState implements UserState {

	public void configureItem(StateTransition stateTransition) {
		System.out.println("Quote Can't be changed");

	}

	public void placeQuote(StateTransition stateTransition) {
		System.out.println("Alreday quote existing ");

	}

	public void PlaceOrder(StateTransition stateTransition) {
		System.out.println("Converting quote to order ");
		stateTransition.changeStateTo(StateTransition.ORDER);
	}

	public void complete(StateTransition stateTransition) {
		System.out.println("Cant stop in the middle");
	}

}

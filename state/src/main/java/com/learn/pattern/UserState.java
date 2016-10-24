package com.learn.pattern;

public interface UserState {
	
	public void configureItem(StateTransition stateTransition);

	public void placeQuote(StateTransition stateTransition);

	public void PlaceOrder(StateTransition stateTransition);
	
	public void complete(StateTransition stateTransition);
}

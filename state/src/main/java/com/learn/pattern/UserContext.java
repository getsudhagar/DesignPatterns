package com.learn.pattern;

public class UserContext implements User, StateTransition {

	private UserState userState;

	public UserState getUserState() {
		return userState;
	}

	public UserContext(UserState userState) {
		this.userState = userState;
	}

	public void changeStateTo(UserState patientState) {
		this.userState = patientState;

	}

	public void configureItem() {
		userState.configureItem(this);

	}

	public void placeQuote() {
		userState.placeQuote(this);

	}

	public void PlaceOrder() {
		userState.PlaceOrder(this);

	}

	public void complete() {
		userState.complete(this);
		
	}

}

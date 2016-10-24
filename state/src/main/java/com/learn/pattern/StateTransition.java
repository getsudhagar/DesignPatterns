package com.learn.pattern;

public interface StateTransition {
	public static final UserState CONFIGURE = new ConfigureState();
	public static final UserState QUOTE = new QuoteState();
	public static final UserState ORDER = new OrderState();
	
	public void changeStateTo(UserState patientState);
}

package com.learn.pattern;

public class AsiaPacificFactory extends AbstractFactory {

	@Override
	public Quote createQuote() {
		return new AsiaPacificQuote();
	}

	@Override
	public Order createOrder() {
		return new AsiaPacificOrder();
	}

}

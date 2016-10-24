package com.learn.pattern;

public class EMEAFactory extends AbstractFactory {

	@Override
	public Quote createQuote() {
		return new EMEAQuote();
	}

	@Override
	public Order createOrder() {
		return new EMEAOrder();
	}

}

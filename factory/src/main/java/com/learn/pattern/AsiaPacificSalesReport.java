package com.learn.pattern;

public class AsiaPacificSalesReport extends SalesReport {

	public AsiaPacificSalesReport() {
		super();
	}

	@Override
	protected Quote getQuote() {
		return new AsiaPacificQuote();
	}

	@Override
	protected Order getOrder() {
		return new AsiaPacificOrder();
	}

}

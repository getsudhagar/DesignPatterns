package com.learn.pattern;

public class EMEASalesReport extends SalesReport {

	public EMEASalesReport() {
		super();
	}

	@Override
	protected Quote getQuote() {
		return new EMEAQuote();
	}

	@Override
	protected Order getOrder() {
		return new EMEAOrder();
	}

}

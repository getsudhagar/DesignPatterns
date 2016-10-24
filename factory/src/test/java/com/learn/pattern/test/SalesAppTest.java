package com.learn.pattern.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.learn.pattern.AbstractFactory;
import com.learn.pattern.AsiaPacificOrder;
import com.learn.pattern.AsiaPacificQuote;
import com.learn.pattern.EMEAOrder;
import com.learn.pattern.EMEAQuote;
import com.learn.pattern.SalesApp;

/**
 * Abstract factory pattern use case implementation test.
 * Creation of family of objects 
 */
public class SalesAppTest {

	@Test
	public void testSalesAppwithAsia() {
		AbstractFactory fact1 = AbstractFactory.getFactory(0);
		SalesApp asiaApp = new SalesApp(fact1);
		assertTrue(asiaApp.getQuote() instanceof AsiaPacificQuote);
		assertTrue(asiaApp.getOrder() instanceof AsiaPacificOrder);
	}

	@Test
	public void testSalesAppwithEMEA() {
		AbstractFactory fact1 = AbstractFactory.getFactory(1);
		SalesApp emeaApp = new SalesApp(fact1);
		assertTrue(emeaApp.getQuote() instanceof EMEAQuote);
		assertTrue(emeaApp.getOrder() instanceof EMEAOrder);
	}

}

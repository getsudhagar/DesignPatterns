package com.learn.pattern.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.learn.pattern.PurchaseRequest;
import com.learn.pattern.SalesSystem;

public class SalesSystemTest {

	private SalesSystem system  = new SalesSystem();
	
	@Before
	public void setUp() throws Exception {
		system.configure();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessRequest() {
		PurchaseRequest request1 = new PurchaseRequest(3,4,"123");
		PurchaseRequest request2 = new PurchaseRequest(55,191,"123");
		PurchaseRequest request3 = new PurchaseRequest(100,180,"123");
		assertFalse(system.processRequest(request1));
		assertTrue(system.processRequest(request2));
		assertTrue(system.processRequest(request3));
	}

}

package com.learn.pattern.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learn.pattern.DiscountService;
import com.learn.pattern.DiscountServiceImpl;
import com.learn.pattern.PromoAdapter;
import com.learn.pattern.PromoService;

public class PromoAdapterTest {

	
	/**
	 *  Adapter changes the interface of DiscountService to adapt it to PromoService
	 */
	@Test
	public void testGetPromotions() {
		DiscountService adaptee  = new DiscountServiceImpl();
		PromoService service= new PromoAdapter(adaptee);
		assertNotNull(service.getPromotions());
	}

}

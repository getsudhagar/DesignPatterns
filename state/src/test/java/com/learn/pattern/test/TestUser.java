package com.learn.pattern.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.learn.pattern.ConfigureState;
import com.learn.pattern.OrderState;
import com.learn.pattern.QuoteState;
import com.learn.pattern.StateTransition;
import com.learn.pattern.UserContext;

public class TestUser {

	@Test
	public void test() {
		UserContext  ctx = new UserContext(StateTransition.CONFIGURE);
		ctx.PlaceOrder();
		assertTrue(ctx.getUserState() instanceof ConfigureState);
		ctx.configureItem();
		assertTrue(ctx.getUserState() instanceof ConfigureState);
		ctx.placeQuote();
		assertTrue(ctx.getUserState() instanceof QuoteState);
		ctx.PlaceOrder();
		assertTrue(ctx.getUserState() instanceof OrderState);
		ctx.complete();
		assertTrue(ctx.getUserState() instanceof ConfigureState);
	}

}

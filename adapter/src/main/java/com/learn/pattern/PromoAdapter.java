package com.learn.pattern;

/**
 * Adapter changes the interface of an object to adapt it to another interface
 *
 */
public class PromoAdapter implements PromoService {
    
	private DiscountService  discountService;
	
	public PromoAdapter(DiscountService discountService) {
		this.discountService = discountService;
	}
	public Promo getPromotions() {
        // call adptee 
		Discount discount = discountService.getDiscounts();
		
		Promo promo = new Promo();
		
		// do conversitions  discount > promo .. updates 
		
		return promo;
	}

}

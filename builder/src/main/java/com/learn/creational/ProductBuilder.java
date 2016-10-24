package com.learn.creational;

public class ProductBuilder {
	
	private Product product ;
	
	public ProductBuilder(Product product) {
		this.product = product;
	}

	public ProductBuilder setX(String x) {
		product.setX(x);
		return this;
	}
	
	public ProductBuilder setY(int y) {
		product.setY(y);
		return this;
	}


	public ProductBuilder setZ(double z) {
		product.setZ(z);
		return this;
	}
	
	public Product build(){
		return product;
	}
}

package com.learn.pattern;

public class PurchaseRequest {
	private int quantity;
	private double price;
	private String customerID;
	
	public PurchaseRequest(int quantity, double price, String id) {
		this.quantity = quantity;
		this.price = price;
		this.customerID =id;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public String getCustomerID() {
		return customerID;
	}

}

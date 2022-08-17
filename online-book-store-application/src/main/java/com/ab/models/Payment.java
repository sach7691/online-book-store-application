package com.ab.models;

public class Payment {

	
	private int paymentId;
	
	private Account accounts;
	
	private Order orders;

	public Payment(int paymentId, Account accounts, Order orders) {
		super();
		this.paymentId = paymentId;
		this.accounts = accounts;
		this.orders = orders;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", accounts=" + accounts + ", orders=" + orders + "]";
	}
	
	
}

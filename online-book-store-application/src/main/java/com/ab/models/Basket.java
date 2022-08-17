package com.ab.models;
import java.util.List;
public class Basket {
	
	private int basketId;
	
	private List<Book> books;
	
	private Customer customer;

	private boolean checkoutStatus;

	public Basket(int basketId, List<Book> books, Customer customer, boolean checkoutStatus) {
		super();
		this.basketId = basketId;
		this.books = books;
		this.customer = customer;
		this.checkoutStatus = checkoutStatus;
	}

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isCheckoutStatus() {
		return checkoutStatus;
	}

	public void setCheckoutStatus(boolean checkoutStatus) {
		this.checkoutStatus = checkoutStatus;
	}

	@Override
	public String toString() {
		return "Basket [basketId=" + basketId + ", books=" + books + ", customer=" + customer + ", checkoutStatus="
				+ checkoutStatus + "]";
	}
	
	
}

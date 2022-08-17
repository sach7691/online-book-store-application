package com.ab.utilities;
import com.ab.daos.BookDAO;
import com.ab.daos.BookDatabaseDAOImpl;
import com.ab.daos.CustomerDAO;
import com.ab.daos.CustomerDatabaseDAOImpl;
import com.ab.models.Book;
import com.ab.models.Customer;
import com.ab.services.BookService;
import com.ab.services.BookServiceImpl;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;

public class BSFactory {
	
	public static Customer getCustomer(String firstName,String lastName,String customerEmail,String customerPassword) {
			
		return new Customer(firstName, lastName, customerEmail, customerPassword);	
		
	}
	
	public static Customer getloginCustomer(String customerEmail,String customerPassword) {
		
		return new Customer(customerEmail, customerPassword);
	}
	
	public static CustomerDAO getCustomerDAO() {
		
		return new CustomerDatabaseDAOImpl();
		
	}
	
	public static CustomerService getCustomerService(CustomerDAO customerDAO) {
			
		return new CustomerServiceImpl(customerDAO);	
		
	}
	
	public static Book getBooks(int bookISBN,String bookTitle,String bookAuthor,double bookPrice) {
		
		return new Book(bookISBN, bookTitle, bookAuthor, bookPrice);
	}
	
	public static BookDAO getBookDAO() {
		
		return new BookDatabaseDAOImpl();
	}
	
	public static BookService getBookService(BookDAO bookDAO) {
		
		return new BookServiceImpl(bookDAO);
	}
	
	public static Book getBooks(int bookISBN) {
		
		return new Book(bookISBN);
	}
	
  public static Book getBooks(String bookTitle) {
		
		return new Book(bookTitle);
	}
	
}

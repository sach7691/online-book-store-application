package com.ab.daos;
import java.util.List;
import com.ab.models.Book;

public interface BasketDAO {
	
	public Book addBook(int bookISBN); //check isbn is already in the store
	public List<Book> viewBasket();
	public Book modifyBasket(int bookISBN);
	public boolean checkout(boolean status);

}

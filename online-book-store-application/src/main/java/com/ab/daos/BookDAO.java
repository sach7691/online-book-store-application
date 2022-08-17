package com.ab.daos;
import java.util.List;
import com.ab.models.Book;

public interface BookDAO {

	public List<Book> viewBooks();
	public Book searchBook(Book books);
	public Book readBookInformation(int bookISBN);
	
}

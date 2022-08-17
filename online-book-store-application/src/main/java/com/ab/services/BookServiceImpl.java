package com.ab.services;
import java.util.List;
import com.ab.daos.BookDAO;
import com.ab.models.Book;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO;
	
	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	public List<Book> viewBooks() {
		
		return this.bookDAO.viewBooks();
	}

	@Override
	public Book searchBook(Book books) {
		
		return this.bookDAO.searchBook(books);
	}

	@Override
	public Book readBookInformation(int bookISBN) {
		// TODO Auto-generated method stub
		return null;
	}

}

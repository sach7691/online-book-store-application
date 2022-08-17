package com.ab.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.daos.BookDAO;
import com.ab.models.Book;
import com.ab.services.BookService;
import com.ab.utilities.BSFactory;

/**
 * Servlet implementation class SerachBookServlet
 */
@WebServlet("/SerachBookServlet")
public class SerachBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerachBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	                            
        request.getRequestDispatcher("search_book.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int  isbn = Integer. parseInt(request.getParameter("bookISBN"));
		 
		 BookDAO dao = BSFactory.getBookDAO();
			
		 BookService bookService = BSFactory.getBookService(dao);
		 
		 Book book = BSFactory.getBooks(isbn);
			
		 Book searchBook = bookService.searchBook(book);
		 
		 request.setAttribute("searchBook", searchBook);
		  
		 if(searchBook != null){
			 
	        	doGet(request, response);
						
			}
				
	}

}

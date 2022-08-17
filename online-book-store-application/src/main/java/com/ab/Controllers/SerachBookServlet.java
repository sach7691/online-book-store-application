package com.ab.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		response.sendRedirect("search_book.jsp");
//      //  request.getRequestDispatcher("search_book.jsp").forward(request, response);
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 int  isbn = Integer. parseInt(request.getParameter("search"));
		 
		 BookDAO dao = BSFactory.getBookDAO();
			
		 BookService bookService = BSFactory.getBookService(dao);
		 
		 Book book = BSFactory.getBooks(isbn);
			
		 Book searchBook = bookService.searchBook(book);
		 
		
		 String bookTitle = searchBook.getBookTitle();
		 
		 HttpSession session = request.getSession(true);
		 session.setAttribute("bookTitle", bookTitle);
		 
		 
		 
		 if(bookTitle != null){
			 
	         response.sendRedirect("search_book.jsp");
						
			}else {
				
				
				
			}
		  
		 
		 
	}

}

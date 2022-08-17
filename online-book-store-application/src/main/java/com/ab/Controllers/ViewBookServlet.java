package com.ab.Controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
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
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/ViewBookServlet")
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		BookDAO dao = BSFactory.getBookDAO();
		
		BookService bookService = BSFactory.getBookService(dao);
		
		List<Book> bookList = bookService.viewBooks();
		 
		HttpSession session = request.getSession(true);
		session.setAttribute("bList", bookList); // Will be available as ${bList} in JSP
        request.getRequestDispatcher("view_books.jsp").forward(request, response);
    }
		

}

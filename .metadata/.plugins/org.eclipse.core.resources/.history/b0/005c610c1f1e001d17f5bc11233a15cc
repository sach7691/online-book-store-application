package com.ab.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ab.models.Book;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DatabaseConnection;

public class BookDatabaseDAOImpl implements BookDAO {

	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	@Override
	public List<Book> viewBooks() {

       con = DatabaseConnection.getConnection();
       
       String query = "SELECT bookTitle FROM book";
       
       List<Book> bList = new ArrayList<>();
       
       try {
      
    	   pst = con.prepareStatement(query);
    	   
    	   rs = pst.executeQuery();
    	   	   
    	   while(rs.next()) {
    		   
//    		   Book b = new Book();
//    		   b.setBookTitle(rs.getString("bookTitle"));
    		  
    		   Book b = BSFactory.getBooks(rs.getString("bookTitle"));
    		   System.out.println(b);
    		   bList.add(b);
    		       		   
    	    } 
    	   
       
           }catch(SQLException e) {
    	   
    	   System.out.println(e);
         }	
       System.out.println(bList);
       return bList;
	}

	@Override
	public Book searchBook(Book books){
		
		con = DatabaseConnection.getConnection();
		
		 String query = "SELECT bookISBN,bookTitle FROM book WHERE bookISBN = ?";
		
		 try {
		      
	    	   pst = con.prepareStatement(query);
	    	   
	    	   pst.setInt(1,books.getBookISBN());
	    	   
	    	   rs = pst.executeQuery();
				
				if (rs.next()) {
					
		        	Book book = new Book(books.getBookISBN(),books.getBookTitle());
		        	
					return book;
				}
	    	   
		  }catch (SQLException e) {
			  
			 System.out.println(e);
		  }
	
		return null;
	}

	@Override
	public Book readBookInformation(int bookISBN) {
		// TODO Auto-generated method stub
		return null;
	}

}

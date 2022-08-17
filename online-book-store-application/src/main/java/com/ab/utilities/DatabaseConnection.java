package com.ab.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
		
	private static Connection con;
		
		
	private DatabaseConnection() {
		
	}
		
	public static Connection getConnection() {
		
	  try{
				 //Load Driver class and register with Driver Manager
		 Class.forName("com.mysql.cj.jdbc.Driver");
				  
				 //Establish connection using Driver Manager
		 con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
				   
				
		  }catch(ClassNotFoundException ex) {
					
			System.out.println(ex);
					
		  }catch(SQLException e) {
					
			System.out.println(e);
		  }
	
			return con;
			
  }
	
}


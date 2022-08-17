package com.ab.daos;
import com.ab.models.Customer;

public interface CustomerDAO {
	
	public Customer registerCustomer(Customer customer);
	public Customer loginCustomer(String customerEmail,String customerPassword);
		 
}

package com.ab.daos;
import com.ab.models.Account;
import com.ab.models.Customer;

public interface AccountDAO {
	
	
	public Account viewAccountDetails();
	public Customer modifyAccountDetails(Customer customer);

}

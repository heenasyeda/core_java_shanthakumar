package com.example.account.service;

import java.util.List;

import com.example.account.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer cus);

	Customer updateCustomer(Customer cus);

	Customer getCustomer(long id);

	List<Customer> getAllCustomers();

	Customer getCustomer(int id);

}
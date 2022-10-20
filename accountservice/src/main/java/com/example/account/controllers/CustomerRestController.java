package com.example.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.entity.Customer;
import com.example.account.service.CustomerService;





@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService  customerService;
	
	@PutMapping("/api/customers/{id}")
    public Customer updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
		customer.setId(id);
        return customerService.updateCustomer(customer);
    }
	
	
	@PostMapping("/api/customers")
	public Customer createCustomer(@RequestBody Customer customer){
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/api/customers/{id}")
	public Customer getCustomer(@PathVariable("id") int id){
		return customerService.getCustomer(id);
		}
	
	@GetMapping("/api/customers")
	public List<Customer>getCustomers(){
		return customerService.getAllCustomers();
	}
	

}

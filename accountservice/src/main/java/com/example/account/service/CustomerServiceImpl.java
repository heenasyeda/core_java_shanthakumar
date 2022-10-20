package com.example.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.account.entity.Customer;
import com.example.account.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	/* (non-Javadoc)
	 * @see com.example.account.service.CustomerService#createCustomer(com.example.account.entity.Customer)
	 */
	@Override
	public Customer createCustomer(Customer cus) {
		return customerRepository.save(cus);
	}

	/* (non-Javadoc)
	 * @see com.example.account.service.CustomerService#updateCustomer(com.example.account.entity.Customer)
	 */
	@Override
	public Customer updateCustomer(Customer cus) {
		return customerRepository.save(cus);
	}

	/* (non-Javadoc)
	 * @see com.example.account.service.CustomerService#getCustomer(long)
	 */
	@Override
	public Customer getCustomer(long id) {
		return customerRepository.findById(id).get();
	}

	/* (non-Javadoc)
	 * @see com.example.account.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.example.account.service.CustomerService#getCustomer(int)
	 */
	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

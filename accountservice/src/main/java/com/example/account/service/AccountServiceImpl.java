package com.example.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.account.entity.Account;
import com.example.account.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	private Account account;
	
	

	@Override
	public Account createAccount(Account acc){
		return accountRepository.save(acc);
	}
	
	
	@Override
	public Account updateAccount(Account acc){
		return accountRepository.save(acc);
	}
	
	
	@Override
	public Account getAccount(long id){
		return accountRepository.findById(id).get();
	}
	
	
	@Override
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}


	@Override
	public Account createSavingsAccount(double balance) {
		
		//account.setAccountType(account.SAVINGS);
        account=new Account("SB",balance);
       
        return accountRepository.save(account);
    
	}


	@Override
	public Account createCurrentAccount(double balance) {
	
		//account.setAccountType(account.CURRENT);
        account=new Account("CA",balance);
        return accountRepository.save(account);
    }
	}



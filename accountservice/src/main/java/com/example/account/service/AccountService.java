package com.example.account.service;

import java.util.List;

import com.example.account.entity.Account;

public interface AccountService {

	Account createAccount(Account acc);

	Account updateAccount(Account acc);

	Account getAccount(long id);

	List<Account> getAllAccounts();

	Account createSavingsAccount(double balance);

	Account createCurrentAccount(double balance);

}
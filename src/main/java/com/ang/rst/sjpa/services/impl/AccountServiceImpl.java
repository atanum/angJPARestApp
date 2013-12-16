package com.ang.rst.sjpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.repository.AccountRepository;
import com.ang.rst.sjpa.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	
	@Autowired
	private AccountRepository acctRepository =null;

	@Override
	public Account createAccount(Account acct) {
		return acctRepository.save(acct);
	}

}

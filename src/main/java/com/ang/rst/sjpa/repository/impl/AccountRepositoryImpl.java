package com.ang.rst.sjpa.repository.impl;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ang.rst.sjpa.dao.AccountDAO;
import com.ang.rst.sjpa.dao.entities.AccountEntity;
import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.repository.AccountRepository;
import com.ang.rst.sjpa.repository.assembler.AccountEntityAssembler;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
	

    @Autowired
    private AccountDAO accountDAO;
    
    @Autowired
    AccountEntityAssembler entityAssembler;


	@Override
	public Account save(Account acct) {
		AccountEntity acctEntity = entityAssembler.convert(acct);
		 if (StringUtils.isBlank(acctEntity.getUuid())) {
			 acctEntity.setUuid(UUID.randomUUID().toString());
	     }
		 
		acctEntity =  accountDAO.saveAndFlush(acctEntity);
		return entityAssembler.convert(acctEntity);
	}

}

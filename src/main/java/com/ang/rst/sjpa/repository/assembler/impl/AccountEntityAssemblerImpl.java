package com.ang.rst.sjpa.repository.assembler.impl;

import org.springframework.stereotype.Component;

import com.ang.rst.sjpa.dao.entities.AccountEntity;
import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.dto.AccountResponseDTO;
import com.ang.rst.sjpa.repository.assembler.AccountEntityAssembler;

@Component
public class AccountEntityAssemblerImpl implements AccountEntityAssembler {

	@Override
	public AccountEntity convert(Account account) {
		AccountEntity acctEntity = new AccountEntity();
		acctEntity.setAcctId(account.getAcctId());
		acctEntity.setAcctname(account.getAcctname());
		acctEntity.setAcctType(account.getAcctType());
		acctEntity.setUuid(account.getUuid());
		acctEntity.setInstitutionName(account.getInstitutionName());
		return acctEntity;
	}

	@Override
	public Account convert(AccountEntity accountEntity) {
		Account acct = new Account();
		acct.setAcctId(accountEntity.getAcctId());
		acct.setAcctname(accountEntity.getAcctname());
		acct.setAcctType(accountEntity.getAcctType());
		acct.setInstitutionName(accountEntity.getInstitutionName());
		acct.setUuid(accountEntity.getUuid());
		return acct;
	}

}

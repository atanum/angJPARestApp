package com.ang.rst.sjpa.dto.assembler.impl;

import org.springframework.stereotype.Component;

import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.dto.AccountRequestDTO;
import com.ang.rst.sjpa.dto.AccountResponseDTO;
import com.ang.rst.sjpa.dto.assembler.AccountDTOAssembler;

@Component
public class AccountDTOAssemblerImpl implements AccountDTOAssembler {

	public Account convert(AccountRequestDTO accountDTO) {
		Account acct= new Account();
		acct.setAcctId(accountDTO.getAcctId());
		acct.setAcctname(accountDTO.getAcctname());
		acct.setAcctType(accountDTO.getAcctType());
		acct.setInstitutionName(accountDTO.getInstitutionName());
		return acct;
	}

	public AccountResponseDTO convert(Account acct) {
		AccountResponseDTO acctResponse= new AccountResponseDTO();
		//acctResponse.setId(1919L);
		acctResponse.setAcctId(acct.getAcctId());
		acctResponse.setAcctname(acct.getAcctname());
		acctResponse.setAcctType(acct.getAcctType());
		acctResponse.setInstitutionName(acct.getInstitutionName());
		acctResponse.setUuid(acct.getUuid());
		return acctResponse;
	}

}

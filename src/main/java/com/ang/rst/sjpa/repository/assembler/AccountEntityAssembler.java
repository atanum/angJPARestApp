package com.ang.rst.sjpa.repository.assembler;

import com.ang.rst.sjpa.dao.entities.AccountEntity;
import com.ang.rst.sjpa.domain.Account;

public interface AccountEntityAssembler {
	
	AccountEntity convert(Account account);

	Account convert(AccountEntity account);


}

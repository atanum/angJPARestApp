package com.ang.rst.sjpa.dto.assembler;

import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.dto.AccountRequestDTO;
import com.ang.rst.sjpa.dto.AccountResponseDTO;

public interface AccountDTOAssembler {

	Account convert(AccountRequestDTO accountDTO);

	AccountResponseDTO convert(Account account);

}

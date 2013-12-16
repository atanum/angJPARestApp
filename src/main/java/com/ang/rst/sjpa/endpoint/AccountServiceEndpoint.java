package com.ang.rst.sjpa.endpoint;

import com.ang.rst.sjpa.dto.AccountRequestDTO;
import com.ang.rst.sjpa.dto.AccountResponseDTO;

public interface AccountServiceEndpoint {
	
	AccountResponseDTO createAccount(AccountRequestDTO accountRequest);
	
	AccountResponseDTO getSampleJson();

}

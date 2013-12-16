package com.ang.rst.sjpa.endpoint.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ang.rst.sjpa.domain.Account;
import com.ang.rst.sjpa.dto.AccountRequestDTO;
import com.ang.rst.sjpa.dto.AccountResponseDTO;
import com.ang.rst.sjpa.dto.assembler.AccountDTOAssembler;
import com.ang.rst.sjpa.endpoint.AccountServiceEndpoint;
import com.ang.rst.sjpa.services.AccountService;

@Path("account")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccountServiceEndpointImpl implements AccountServiceEndpoint {
	
	private  Logger log = LoggerFactory.getLogger(AccountServiceEndpointImpl.class);
	
	@Autowired
	AccountDTOAssembler acctDTOAssembler;
	
	@Autowired
	AccountService acctService;

	@POST
	@Override
	public AccountResponseDTO createAccount(AccountRequestDTO accountRequest) {
		log.debug(" >>> inside  createAccount >>");
		
		Account account =acctDTOAssembler.convert(accountRequest);
		account=acctService.createAccount(account);
		return acctDTOAssembler.convert(account);
	}
	
	 @GET
	 @Path("{id}")
	public void getAccount() {
		// TODO Auto-generated method stub

	}
	
	@GET
	@Path("sample")
	public AccountResponseDTO getSampleJson() {
		AccountResponseDTO acctResponse= new AccountResponseDTO();
		acctResponse.setId(1919L);
		acctResponse.setAcctId("2424237373");
		acctResponse.setAcctname("nitin's acct");
		acctResponse.setAcctType("Savings");
		acctResponse.setInstitutionName("BOA");
		return acctResponse;
	}

}

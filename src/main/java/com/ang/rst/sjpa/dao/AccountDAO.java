package com.ang.rst.sjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ang.rst.sjpa.dao.entities.AccountEntity;

public interface AccountDAO  extends JpaRepository<AccountEntity, Long> {

}

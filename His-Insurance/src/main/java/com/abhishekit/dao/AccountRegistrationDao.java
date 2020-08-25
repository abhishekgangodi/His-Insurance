package com.abhishekit.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishekit.entity.AccountRegistrationEntity;

public interface AccountRegistrationDao extends JpaRepository<AccountRegistrationEntity, Serializable> {

	
}

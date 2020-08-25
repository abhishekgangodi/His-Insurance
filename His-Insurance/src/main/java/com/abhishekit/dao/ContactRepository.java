package com.abhishekit.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishekit.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Serializable> {

	
}

package com.abhishekit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishekit.dao.ContactRepository;
import com.abhishekit.entity.ContactEntity;
import com.abhishekit.model.Contact;

@Service
public class ContactServiceImpl implements ContactService
{
	@Autowired
	private ContactRepository dao;
	
	public boolean saveContact(Contact c) {
		
		ContactEntity ce = new ContactEntity();
		
		BeanUtils.copyProperties(c, ce);
		
		ContactEntity savedEntity = dao.save(ce);
		
		return savedEntity.getContactId() != null ;

	}

	
	public List<Contact> getAllContacts() {
		
		List<ContactEntity> entities = dao.findAll();
		
		/*
		 * List<Contact> contact = new ArrayList<Contact>();
		 * 
		 * //legacy approach for(ContactEntity entity:entities) { Contact c = new
		 * Contact(); BeanUtils.copyProperties(entity, c); contact.add(c); }
		 * 
		 * //return contact;
		 */		
		
		List<Contact> contacts = entities.stream().map(entity->{
			
			Contact con = new Contact();
			BeanUtils.copyProperties(entity, con);
			return con;
		}).collect(Collectors.toList());
		
		return contacts;
	}

	public Contact getContactById(Integer cid) {
		
		Optional<ContactEntity> ce = dao.findById(cid);
		
		if(ce.isPresent()) {
			
			ContactEntity conEn = ce.get();
			Contact contact = new Contact();
			BeanUtils.copyProperties(conEn, contact);
			return contact;
		}
		
		return null;
	}


	public boolean updateContact(Contact c) {
		
		return false;
	}


	public boolean deleteContact(Integer cid) {
		
		dao.deleteById(cid);
		
		Optional<ContactEntity> ce = dao.findById(cid);
		
		if(ce.isPresent()) {
		return false;
		}
		return true;
	}

}

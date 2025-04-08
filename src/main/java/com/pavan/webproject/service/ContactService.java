package com.pavan.webproject.service;

import java.util.List;

import com.pavan.webproject.entity.Contact;

public interface ContactService {
	List<Contact> getAllContact();
	
	Contact saveContact(Contact contact);
	Contact getContactById(Long id);
	Contact updateContact(Contact contact);
	public void delete(Long id);
	Contact findById(Long id);

}

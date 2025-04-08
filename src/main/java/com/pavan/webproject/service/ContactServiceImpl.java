package com.pavan.webproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pavan.webproject.entity.Contact;
import com.pavan.webproject.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService{
	
	private ContactRepository contactRepository;
	
	
	public ContactServiceImpl( ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public List<Contact> getAllContact(){
		
		return contactRepository.findAll();
	}

	@Override
	public Contact saveContact(Contact contact) {
	
		return contactRepository.save(contact);
	}

	@Override
	public Contact getContactById(Long id) {
		
		return contactRepository.findById(id).get();
		
	}

	@Override
	public Contact updateContact(Contact contact) {
		
		return contactRepository.save(contact);
	}

	@Override
	public Contact findById(Long id) {
		Optional<Contact> contact1 = contactRepository.findById(id);
		Contact contact = contact1.get();
		return contact;
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
		
	}

	

}

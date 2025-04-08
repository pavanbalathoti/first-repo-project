package com.pavan.webproject.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.webproject.entity.Contact;
import com.pavan.webproject.repository.ContactRepository;
import com.pavan.webproject.service.ContactService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactRestController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private ContactRepository contactRepository;
	
	

	@PostMapping("/contact")
	public Contact addtContact(@RequestBody Contact contact) {
		
		 contact =  contactService.saveContact(contact);
	return contact;
	}
	

	@GetMapping("/contacts")
	public List<Contact> listContact() {
		
		List<Contact> contacts =  contactService.getAllContact();
	return contacts;
	}
	
//	public String ContactEdit(@PathVariable Long id, Model model) {
//		model.addAttribute("contact", contactService.getContactById(id));
//	    return "contact_edit";
//	}
//	
	
	
	@GetMapping("/contacts/delete/{id}")
	public String deleteContact(@PathVariable Long id) {
		contactService.delete(id);
		return "redirect:/contact/all";
		
	}
	
}


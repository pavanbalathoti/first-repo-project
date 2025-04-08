package com.pavan.webproject.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.pavan.webproject.entity.Contact;
import com.pavan.webproject.repository.ContactRepository;
import com.pavan.webproject.service.ContactService;

import jakarta.validation.Valid;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private ContactRepository contactRepository;
	
	

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}
	@GetMapping("/contact")
	public String ContactForm() {
	return "contact";
}
	@PostMapping("/replay")
	public String saveContact(@ModelAttribute("contact") Contact contact) {
		
		contactService.saveContact(contact);
		return "replay";
	}

	@GetMapping("/contact/all")
	public String listContact(Model model) {
		model.addAttribute("contacts", contactService.getAllContact());
	return "contact_all";
	}
	@GetMapping("/contacts/edit/{id}")
	public String editcontactGet(@PathVariable(value="id") Long id, Model model)
	  {
		  
		Contact contact = contactService.findById(id);
		model.addAttribute("contact", contact);
		return "contact_edit";
		  
	  }
//	public String ContactEdit(@PathVariable Long id, Model model) {
//		model.addAttribute("contact", contactService.getContactById(id));
//	    return "contact_edit";
//	}
//	
	@PostMapping("/contacts/{id}")
		
	public String contactUpdate( @ModelAttribute("contact") @Valid Contact contact, BindingResult result){
		
		if(result.hasErrors()) {
			 
			return "contact_edit";
		}
		contactService.saveContact(contact);
//	Contact existingContact = contactService.getContactById(id);
//	existingContact.setId(id);
//	existingContact.setName(contact.getName());
//	existingContact.setEmail(contact.getEmail());
//	existingContact.setPassword(contact.getPassword());
//	existingContact.setQuestion(contact.getQuestion());
//	
//	contactService.updateContact(existingContact);
	return "redirect:/contact/all";
			
	}
	
	@GetMapping("/contacts/delete/{id}")
	public String deleteContact(@PathVariable Long id) {
		contactService.delete(id);
		return "redirect:/contact/all";
		
	}
	
}


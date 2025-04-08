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

import com.pavan.webproject.entity.User;
import com.pavan.webproject.repository.UserRepository;
import com.pavan.webproject.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	
	

	@PostMapping("/user")
	public Object addtUser(@RequestBody User user) {
		
		   
	return userService.save(user);
	}
	

	@GetMapping("/users")
	public List<User> listUser() {
		
		List<User> users =  userService.list();
	return users;
	}
	
	@GetMapping("/user/{id}")
	public User UserEdit(@PathVariable Long id) {
		
	    return userService.findById(id);
	}
	
	
	
//	@GetMapping("/users/delete/{id}")
//	public String deleteUser(@PathVariable Long id) {
//		
//		return userService.delete(id);;
//		
//	}
	
}


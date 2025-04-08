package com.pavan.webproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pavan.webproject.entity.User;
import com.pavan.webproject.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	 UserRepository userRepository;
	
	
	

	

	@Override
	public User findById(Long id) {
		Optional<User> user1 = userRepository.findById(id);
		User user = user1.get();
		return user;
	}

	@Override
	public void delete(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Object save(User user) {
		
		return userRepository.save(user);
	}

	

}

package com.pavan.webproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.webproject.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}

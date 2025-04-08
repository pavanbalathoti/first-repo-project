package com.pavan.webproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	@Column(nullable = false, unique = true, length = 45 )
	private String email;
	
	@Column(nullable = false, length = 45)
	private String password;
	
	@Column(nullable = false)
	private String question;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email, String password, String question) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.question = question;
	}

@Override
public String toString() {
	return "Contact [name=" + name + ", email=" + email + ", password=" + password + ", question=" + question + "]";
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}

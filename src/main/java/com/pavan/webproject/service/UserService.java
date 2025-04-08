package com.pavan.webproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pavan.webproject.entity.User;

//import com.pavan.webproject.model.User;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;


public interface UserService {

	/*  public List<User> getUsers() {
        String url = "https://jsonplaceholder.typicode.com/users";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        // Parse the JSON response
        JSONArray jsonArray = new JSONArray(response);
        List<User> users = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonUser = jsonArray.getJSONObject(i);
            String name = jsonUser.getString("name");
            String email = jsonUser.getString("email");

            // Assuming a User class exists with name and email properties
            users.add(new User(name, email));
        }

        return users;
        
    
    }*/
	 public User findById(Long id);
	 public List<User> list();
	 public Object save(User user);
	 public void delete(Long id);
}

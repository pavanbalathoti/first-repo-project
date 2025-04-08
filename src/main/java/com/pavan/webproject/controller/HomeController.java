package com.pavan.webproject.controller;

import com.pavan.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    
    
    @GetMapping("/")
	public String homepage() {
		return "home";
	}

//    @GetMapping("/")
//    public String homepage(Model model) {
//        List<User> users = userService.getUsers();
//        model.addAttribute("users", users);
//        return "user";
//    }
}

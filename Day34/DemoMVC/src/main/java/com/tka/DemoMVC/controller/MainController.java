package com.tka.DemoMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.DemoMVC.entity.User;
import com.tka.DemoMVC.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
		@PostMapping("login")
		public String login(@ModelAttribute User user) {
			System.out.println(user);
			String msg= service.login(user);
			System.out.println(msg);
			return "home";
			
		}

}

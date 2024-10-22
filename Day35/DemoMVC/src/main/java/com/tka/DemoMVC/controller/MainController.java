package com.tka.DemoMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.DemoMVC.entity.Person;
import com.tka.DemoMVC.entity.User;
import com.tka.DemoMVC.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService service;
	
		@PostMapping("login")
		public String login(@ModelAttribute User user,Model model) {
			System.out.println(user);
			String msg= service.login(user);
			System.out.println(msg);
			
			if(msg.equalsIgnoreCase("valid user")) {
				List<Person> personlist= service.geAllPersonRecord();
				model.addAttribute("list", personlist);
				return "home";
			}else {
				return "login";
			}
			
			
			
		}

}

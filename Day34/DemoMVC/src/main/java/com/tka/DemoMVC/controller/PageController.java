package com.tka.DemoMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/")
	public String defaultPage() {
		return "login";
	}
	
	

}

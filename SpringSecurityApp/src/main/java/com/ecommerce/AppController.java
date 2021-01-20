package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
//	private UserRepository userRepo; @Autowired
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
}

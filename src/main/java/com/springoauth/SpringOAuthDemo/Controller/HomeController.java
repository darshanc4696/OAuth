package com.springoauth.SpringOAuthDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String requesting()
	{
		return "Welcome to Darshan World!";
	}

}

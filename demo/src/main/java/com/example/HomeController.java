package com.example;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	@Secured("ROLE_GOTO")
	public String home() {
		return "Hello, Amsterdam";
	}

}

package com.nit.org;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(path = "/wc")
	public String display() {
		System.out.println("welcome to java");
		return "employee";
		
	}	
}

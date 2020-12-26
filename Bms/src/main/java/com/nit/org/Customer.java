package com.nit.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer {
	
	@RequestMapping(path = "/cm")
	public String display() {
		System.out.println("display method called");
		return "custom";
	}
}

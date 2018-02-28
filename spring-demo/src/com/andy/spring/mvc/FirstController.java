package com.andy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	
	@RequestMapping("/index") //mapped to the root
	public String showMypage() {
		return "main--menu";
	}
}

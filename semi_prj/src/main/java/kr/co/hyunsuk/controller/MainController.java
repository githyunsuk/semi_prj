package kr.co.hyunsuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "login/login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "login/register";
	}
}

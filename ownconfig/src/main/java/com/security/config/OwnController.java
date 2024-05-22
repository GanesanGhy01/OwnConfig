package com.security.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class OwnController {

	@GetMapping("hello")
	public String hello(HttpServletRequest request) {
		return "hello" +" " +request.getSession().getId();
	}
	@GetMapping("about")
	public String about(HttpServletRequest request) {
		return "Telusko" + " "+ request.getSession().getId();
	}
	@PostMapping("save")
	public String save(@RequestBody Student student) {
		return "insert";
	}
}

package com.helloapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/")
	@ResponseBody
	public String hello()
	{
		return "Welcome to Hello World";
	}

}

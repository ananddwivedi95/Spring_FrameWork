package com.swiggy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
 
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello()
	{
		return"welcome in Spring";
	}
}

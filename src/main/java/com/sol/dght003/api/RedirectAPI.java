package com.sol.dght003.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RedirectAPI {

	@RequestMapping("/test/**")
	public String redirect1() {
		return "forward:/";
	}
	
	@RequestMapping("/share/**")
	public String redirect2() {
		return "forward:/";
	}
}

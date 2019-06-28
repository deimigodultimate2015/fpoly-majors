package com.sol.dght003.api;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RedirectAPI {

	@RequestMapping("/test/**")
	public void redirect1(HttpServletResponse response) throws Exception {
		response.sendRedirect("http://fpolymajors.herokuapp.com/");
	}
	
	@RequestMapping("/share/**")
	public void redirect2(HttpServletResponse response) throws Exception {
		response.sendRedirect("http://fpolymajors.herokuapp.com/");
	}
}

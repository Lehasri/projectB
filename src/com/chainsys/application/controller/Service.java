package com.chainsys.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("/welcome")
public String welcomePage() {
	return "<h1>Welcome</h1>";
}
	
	@RequestMapping ("/home")
	public String homePage() {
		String html="<div>Spring Boot is an open-source micro framework maintained by a company called Pivotal."
				+ " It provides Java developers with a platform to get started "
				+ "with an auto configurable production-grade Spring application</div>";
		return html;
	}
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="madurai")String city) {
		return "<h1>Welcome to "+city+"</h1>";
	}
}

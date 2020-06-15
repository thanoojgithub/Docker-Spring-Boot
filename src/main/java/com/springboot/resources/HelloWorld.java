package com.springboot.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	@RequestMapping("/")
	public String sayHello(@RequestParam(defaultValue = "Guest") String name) {
		logger.info("Name : "+ name);
		return "Hello! " + name + "!!";
	}

}

package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.resources.HelloWorld;

@SpringBootApplication
@ComponentScan(basePackageClasses=HelloWorld.class)
public class SpringbootoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootoneApplication.class, args);
	}

}

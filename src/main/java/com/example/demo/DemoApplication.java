package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@RestController
public class DemoApplication {
Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	@GetMapping("/err")
	public String home22() {
		try
		{
  			// ...
  			throw new Exception("Some required files are missing");
		}
		catch(Exception ex)
		{
			logger.error("An Exception occurred!!!", ex);
		 //ex.printStackTrace(); //this will get "Some required files are missing"
		}
		return "hello error";

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

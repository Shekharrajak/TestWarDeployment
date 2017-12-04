package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class TestJarFileApplication {

        @Value("${server.port}")
        private String value;

        @Value("${ENV1}")
        private String env1;

        @Value("${app.prop3}")
        private String env3;

        @Value("${app.prop4}")
        private String env4;

	public static void main(String[] args) {
		SpringApplication.run(TestJarFileApplication.class, args);
	}
	
	// go to localhost:8121
	@GetMapping("/")
	public String home() {	

	//	return System.getenv("WORDPRESS_DB_HOSTURL")+":"+value+":"+u+":"+last;


         return value+":"+env1+":"+env3+":"+env4;
		
	}

	// go to localhost:8121
	@GetMapping("/hello")
	public String hello() {	

	//	return System.getenv("WORDPRESS_DB_HOSTURL")+":"+value+":"+u+":"+last;

         return "Hello " + env4 + " ! :) "; 
		
	}
}

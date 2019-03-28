package com.example.SpringBootJersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class SpringBootJerseyApplication  extends SpringBootServletInitializer {
public class SpringBootJerseyApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJerseyApplication.class, args);
                //new SpringBootJerseyApplication().configure(new SpringApplicationBuilder(SpringBootJerseyApplication.class)).run(args);
	}

}

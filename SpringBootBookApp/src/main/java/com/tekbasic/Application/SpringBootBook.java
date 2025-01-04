package com.tekbasic.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootBook {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBook.class,args);
	}
}
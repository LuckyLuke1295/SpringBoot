package com.vn.Polyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller","Entity","Repository","service"})
public class PolyshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolyshopApplication.class, args);
	}

}

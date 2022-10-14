package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookShopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookShopApplication.class, args);
	}

}

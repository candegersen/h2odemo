package com.h2demo.h2demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.h2demo.h2demo.model.Product;
import com.h2demo.h2demo.repository.ProductRepository;

@SpringBootApplication
public class H2demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData(ProductRepository repository) {
		return (args) -> {
			repository.save(new Product("Product A", 100.00));
			repository.save(new Product("Product B", 50.00));

		};
	}

	

}

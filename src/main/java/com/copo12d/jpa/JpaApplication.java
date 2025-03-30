package com.copo12d.jpa;

import com.copo12d.jpa.models.Author;
import com.copo12d.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository) {
		return args -> {
			var author = Author.builder()
					.firstName("Angel")
					.lastName("Calmen")
					.age(20)
					.email("acalmenc@gmail.com")
					.build();
			authorRepository.save(author);
		};
	}

}

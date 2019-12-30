package com.nolanchostner.demoBooks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication
@EnableJpaAuditing
public class DemoBooks {

	public static void main(String[] args) {
		SpringApplication.run(DemoBooks.class, args);
	}

}

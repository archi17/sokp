package org.ak.sokp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SokpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SokpApplication.class, args);
	}

}

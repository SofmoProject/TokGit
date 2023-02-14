package com.sofmo.TokGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TokGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokGitApplication.class, args);
	}

}

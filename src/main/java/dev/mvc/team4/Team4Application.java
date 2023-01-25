package dev.mvc.team4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.mvc"})
public class Team4Application {

	public static void main(String[] args) {
		SpringApplication.run(Team4Application.class, args);
	}

}

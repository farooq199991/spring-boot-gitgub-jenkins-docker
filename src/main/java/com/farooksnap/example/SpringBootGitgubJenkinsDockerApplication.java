package com.farooksnap.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitgubJenkinsDockerApplication {

	@GetMapping("/message")
	public String getmessage(){

		return "Running the Docker for jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitgubJenkinsDockerApplication.class, args);
	}

}

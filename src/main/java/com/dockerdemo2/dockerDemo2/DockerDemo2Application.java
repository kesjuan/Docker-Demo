package com.dockerdemo2.dockerDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DockerDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemo2Application.class, args);
	}

}

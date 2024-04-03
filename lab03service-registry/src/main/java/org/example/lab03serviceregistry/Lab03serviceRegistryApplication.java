package org.example.lab03serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab03serviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab03serviceRegistryApplication.class, args);
	}

}

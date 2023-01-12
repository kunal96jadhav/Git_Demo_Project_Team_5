package com.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceClientStudentAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientStudentAddApplication.class, args);
	}

}

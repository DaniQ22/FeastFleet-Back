package com.FeastFleet.FeastFleet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.FeastFleet.FeastFleet")
public class FeastFleetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeastFleetApplication.class, args);
	}

}

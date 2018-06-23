package com.masoko.merchantOnbording.merchantOnbording;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@EnableEurekaClient
@EnableJpaRepositories (basePackages = "com.masoko.merchantOnbording.merchantOnbording.repository")
@SpringBootApplication // Enables component scanning and auto-configuration
public class MerchantOnbordingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantOnbordingApplication.class, args); // bootsraps the application.
	}
}

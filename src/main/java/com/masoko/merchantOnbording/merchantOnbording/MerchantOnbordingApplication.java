package com.masoko.merchantOnbording.merchantOnbording;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories (basePackages = "com.masoko.merchantOnbording.merchantOnbording.repository")
@SpringBootApplication // Enables component scanning and auto-configuration
public class MerchantOnbordingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantOnbordingApplication.class, args); // bootsraps the application.
	}
}

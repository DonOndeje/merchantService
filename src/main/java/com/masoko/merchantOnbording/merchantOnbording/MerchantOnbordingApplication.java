package com.masoko.merchantOnbording.merchantOnbording;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories (basePackages = "com.masoko.merchantOnbording.merchantOnbording.repository")
@SpringBootApplication
public class MerchantOnbordingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantOnbordingApplication.class, args);
	}
}

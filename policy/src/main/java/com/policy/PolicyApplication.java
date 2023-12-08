package com.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolicyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolicyApplication.class, args);
		String formattedId =String.format("PO-%05d", 67);
		System.out.println("ffff");
		System.out.println(formattedId);
	}

}

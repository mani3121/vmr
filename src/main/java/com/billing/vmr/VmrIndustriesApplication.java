package com.billing.vmr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories
public class VmrIndustriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmrIndustriesApplication.class, args);
	}

}

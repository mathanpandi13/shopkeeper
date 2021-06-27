package com.shopkeeper.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.shopkeeper")
public class ShopkeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopkeeperApplication.class, args);
	}

}

package com.shopme.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.shopme.common.entity","com.shopme.admin.user"})
public class ShopmeBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmeBackEndApplication.class, args);
	}

}

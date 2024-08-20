package com.groupeisi.server_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class, args);
	}

}

package com.stockorganizer.stockorganizernamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StockOrganizerNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockOrganizerNamingServerApplication.class, args);
	}

}

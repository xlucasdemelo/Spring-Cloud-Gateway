package com.lucasaguiar.gatewaypoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayPocApplication.class, args);
	}

}

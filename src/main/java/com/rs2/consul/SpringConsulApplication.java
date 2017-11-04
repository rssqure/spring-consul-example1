package com.rs2.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class SpringConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsulApplication.class, args);
	}
}

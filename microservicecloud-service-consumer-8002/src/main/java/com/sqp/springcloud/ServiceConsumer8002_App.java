package com.sqp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceConsumer8002_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(ServiceConsumer8002_App.class, args);
	}
}